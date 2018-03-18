package br.com.spring.mvc.vitorbrangioni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.spring.mvc.vitorbrangioni.model.User;
import br.com.spring.mvc.vitorbrangioni.model.dao.UserDAO;

@Controller
public class IndexController {
	
	@RequestMapping("/register-post")
	public String start(Model model, User user) {
		
		UserDAO userDAO = new UserDAO();
		userDAO.insert(user);
		
		model.addAttribute("name", user.getName());
		return "index";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/users")
	public String showAll(Model model) {
		UserDAO userDAO = new UserDAO();
		model.addAttribute("users", userDAO.show());
		
		return "users";
	}

}
