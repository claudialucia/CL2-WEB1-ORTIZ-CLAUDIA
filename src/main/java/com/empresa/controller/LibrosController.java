package com.empresa.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping
	@ResponseBody
	public ResponseEntity<HashMap<String, Object>>registraLibro(@RequestBody Libros obj){
		HashMap<String,Object>salida=new HashMap<String,Object>();
		
		try {
			List<Libros>listaLib=service.listaLibrosPorId(obj.getIdLibro());
			if(CollectionUtils.isEmpty(listaLib)) {
				obj.setIdLibro(0);
				Libros objSalida=service.registraLibros(obj);
				if(objSalida==null) {
					salida.put("mensaje", "Error en el registro");
				}else {
					salida.put("mensaje", "REGISTRO EXITOSO!!!");
				}
			}else {
				salida.put("mensaje", "el LIBRO ya existe :" +obj.getIdLibro());
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", "Error en el registro :"+e.getMessage());
		}
		
		return ResponseEntity.ok(salida);
	}
	
}
