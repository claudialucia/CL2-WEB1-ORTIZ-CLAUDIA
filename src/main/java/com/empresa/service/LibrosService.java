package com.empresa.service;

import java.util.List;

import com.empresa.entity.Libros;

public interface LibrosService {

	
	public abstract List<Libros> listaTodos();
	
	public abstract Libros registraLibros(Libros obj);
	
	public abstract List<Libros>listaLibrosPorId(int idLibro);
}
