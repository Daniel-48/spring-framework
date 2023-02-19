package com.dam.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MyComplexService implements IService {

	@Override
	public String operation() {
		return "¿Qué es la Inversión de Control (IoC)?";
	}

}
