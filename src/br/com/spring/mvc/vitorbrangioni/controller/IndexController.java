package br.com.spring.mvc.vitorbrangioni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/helloWorld")
	public String start() {
		return "index";
	}

}
