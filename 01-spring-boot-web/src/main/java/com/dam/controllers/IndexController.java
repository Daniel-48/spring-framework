package com.dam.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dam.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Value("${text.index.controller.index.title}")
	private String indexText;
	@Value("${text.index.controller.profile.title}")
	private String profileText;
	@Value("${text.index.controller.list.title}")
	private String listText;

	@GetMapping(value = { "/index", "/", "" })
	public String index(Model model) {
		model.addAttribute("title", indexText);
		return "index";
	}

	@GetMapping("/users/profile")
	public String profile(Model model) {
		User user = new User("Daniel", "Pompa Pareja", "648 11 99 48", "daniel.pompa@gmail.com");
		model.addAttribute("user", user);
		model.addAttribute("title", profileText + user.getName());
		return "users/profile";
	}

	@GetMapping("/users/list")
	public String list(Model model) {
		model.addAttribute("title", listText);
		return "users/list";
	}

	/**
	 * Annotation that binds a method parameter or method return value to a named
	 * model attribute, exposed to a web view. Supported for controller classes
	 * with @RequestMapping methods.
	 */
	@ModelAttribute("users")
	public List<User> userList() {
		List<User> users = Arrays.asList(new User("Emma", "Ciambrino Baz", "669 97 90 30", "emma.ciambrino@gmail.com"),
				new User("Daniel", "Pompa Pareja", "648 11 99 48", "daniel.pompa@gmail.com"),
				new User("Gael", "Pompa Ciambrino", null, null));
		return users;
	}

}
