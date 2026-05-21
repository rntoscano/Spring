package com.generation.blogpessoal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostagemController {

	@GetMapping("/postagens")
	public String getPostagens() {
		return "Rota postagens funcionando!";
	}
}