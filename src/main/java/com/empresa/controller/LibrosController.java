package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Libros;
import com.empresa.service.LibrosService;

@RestController
@RequestMapping("/rest/libros")
public class LibrosController {
	
	//siempre se llama con la interfaz del service 	
	@Autowired
	private LibrosService service;
	
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Libros>>listarLibros(){
		return ResponseEntity.ok(service.listaTodos());
	}
	
}
