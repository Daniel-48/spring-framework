package com.dam.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app/params")
public class ParametersController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Parámetros");
		model.addAttribute("subtitle", "Enviar parámetros Request HTTP GET - URL");
		model.addAttribute("date", LocalDate.now());
		return "parameters/index";
	}

	@GetMapping("/string")
	public String params(@RequestParam(required = false, defaultValue = "Hola mundo!") String text, Model model) {
		model.addAttribute("title", "Parámetros");
		model.addAttribute("subtitle", "Recibir parámetros Request HTTP GET - URL");
		model.addAttribute("result", "El texto enviado es: " + text);
		return "parameters/view";
	}

	@GetMapping("/mix-params")
	public String params(@RequestParam String greeting, @RequestParam Integer number, Model model) {
		model.addAttribute("title", "Parámetros");
		model.addAttribute("subtitle", "Recibir parámetros Request HTTP GET - URL");
		model.addAttribute("result", "El saludo enviado es: " + greeting + " | El número enviado es: " + number);
		return "parameters/view";
	}

	@GetMapping("/date")
	public String params(@RequestParam String text,
			@RequestParam(name = "date") @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate date, Model model) {
		date = LocalDate.of(2022, 03, 20);
		String formattedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		model.addAttribute("title", "Parámetros");
		model.addAttribute("subtitle", "Recibir parámetros Request HTTP GET - URL");
		model.addAttribute("result", "Nombre: " + text + " | Fecha de nacimiento: " + formattedDate);
		return "parameters/view";
	}

}
