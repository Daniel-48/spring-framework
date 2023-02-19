package com.dam.services;

import org.springframework.stereotype.Service;

@Service
public class MySimpleService implements IService {

	@Override
	public String operation() {
		return "Ejecutando un proceso!";
	}

}