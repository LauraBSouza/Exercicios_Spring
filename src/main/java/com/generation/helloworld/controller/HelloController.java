package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello() {
		return "Objetivo de Aprendizagem da semana: 1- Aprender como utiliza o Mysql, 2- Como fazer um DER,"
				+ " 3- Para que serve o como utilizar o Spring tool, 4- Fazer o prototipo do banco de dados do projeto,"
				+ " 5- Fazer a primeira model do projeto Spring. ";
	}
	
	@GetMapping("/bsm")
	public String getHello2() {
		return "Habilidades e mentalidades utilizadas: Mentalidade de Crescimento,"
				+ " Persistência e Atenção aos detalhes.";
	}

}
