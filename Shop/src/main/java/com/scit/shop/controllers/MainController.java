package com.scit.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //hi
public class MainController {

	@RequestMapping("/")
	public String index() {
		
		return "index"; 
	}
}
