package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.services.*;

@Controller
public class IndexController {

	@Autowired
	HelloService h;
	
	@Autowired
	GoodbyeService g;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String show() {
		return h.getMessage();
	}
	
	@RequestMapping("/goodbye")
	@ResponseBody
	public String goodbye() {
		return g.getMessage();
	}
}
