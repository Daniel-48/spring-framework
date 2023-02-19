package com.dam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dam.services.IService;

@Controller
@RequestMapping("/app")
public class IndexController {

	@Autowired
	private IService service;

	@GetMapping({ "/", "", "/index" })
	public String index(Model model) {
		model.addAttribute("title", "Inyección de Dependencias");
		model.addAttribute("object", service.operation());
		return "index";
	}

}