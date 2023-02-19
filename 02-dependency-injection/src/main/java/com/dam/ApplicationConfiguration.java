package com.dam;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.dam.models.InvoiceItems;
import com.dam.models.Product;

@Configuration
public class ApplicationConfiguration {

	@Bean
	List<InvoiceItems> sportsItems() {
		Product product1 = new Product("Pulsera de actividad Fitbit", 139.99F);
		Product product2 = new Product("Bicicleta de montaña Rockrider", 2399.99F);
		Product product3 = new Product("Rack cross training multifuncional Corength 900", 509.99F);
		Product product4 = new Product("Zapatilla Adidas Tracerocker 2.0 Trail Running", 49.99F);

		InvoiceItems line1 = new InvoiceItems(product1, 3);
		InvoiceItems line2 = new InvoiceItems(product2, 3);
		InvoiceItems line3 = new InvoiceItems(product3, 1);
		InvoiceItems line4 = new InvoiceItems(product4, 3);

		return Arrays.asList(line1, line2, line3, line4);
	}

	@Bean
	@Primary
	List<InvoiceItems> officeItems() {
		Product product1 = new Product("PC Workstation", 2349F);
		Product product2 = new Product("Monitor Samsung 24\"", 198.99F);
		Product product3 = new Product("Teclado Logitech", 79.99F);
		Product product4 = new Product("Ratón Logitech", 49.99F);

		InvoiceItems line1 = new InvoiceItems(product1, 10);
		InvoiceItems line2 = new InvoiceItems(product2, 10);
		InvoiceItems line3 = new InvoiceItems(product3, 10);
		InvoiceItems line4 = new InvoiceItems(product4, 10);

		return Arrays.asList(line1, line2, line3, line4);
	}

}