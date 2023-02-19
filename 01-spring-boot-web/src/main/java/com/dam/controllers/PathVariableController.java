package com.dam.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/variables")
public class PathVariableController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Variables");
		model.addAttribute("subtitle", "Enviar parámetros de la ruta con @PathVariable");
		model.addAttribute("date", LocalDate.now());
		return "variables/index";
	}

	@GetMapping("/string/{text}")
	public String variables(@PathVariable String text, Model model) {
		model.addAttribute("title", "Variables");
		model.addAttribute("subtitle", "Recibir parámetros de la ruta con @PathVariable");
		model.addAttribute("result", "El texto enviado en la ruta es: " + text);
		return "variables/view";
	}

	@GetMapping("/string-number/{greeting}/{number}")
	public String variables(@PathVariable String greeting, @PathVariable Integer number, Model model) {
		model.addAttribute("title", "Variables");
		model.addAttribute("subtitle", "Recibir parámetros de la ruta con @PathVariable");
		model.addAttribute("result",
				"El saludo enviado en la ruta es: " + greeting + " | El número enviado en la ruta es: " + number);
		return "variables/view";
	}

	@GetMapping("/string-date/{text}/{date}")
	public String variables(@PathVariable String text,
			@DateTimeFormat(pattern = "dd-MM-yyyy") @PathVariable LocalDate date, Model model) {
		String formattedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		model.addAttribute("title", "Variables");
		model.addAttribute("subtitle", "Recibir parámetros de la ruta con @PathVariable");
		model.addAttribute("result", "Nombre: " + text + " | Fecha de nacimiento: " + formattedDate);
		return "variables/view";
	}

}
