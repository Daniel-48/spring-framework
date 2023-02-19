package com.dam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dam.models.Invoice;

@Controller
@RequestMapping("/app/invoice")
public class InvoiceController {

	@Autowired
	private Invoice invoice;

	@GetMapping("/view")
	public String view(Model model) {
		model.addAttribute("invoice", invoice);
		model.addAttribute("title", "Factura");
		return "invoices/view";
	}

}