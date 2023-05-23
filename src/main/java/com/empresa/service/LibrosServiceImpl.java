package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Libros;
import com.empresa.repository.LibrosRepository;


@Service
public class LibrosServiceImpl implements LibrosService{

	
	@Autowired
	private LibrosRepository  librosRepository;
	
	@Override
	public List<Libros> listaTodos() {
		// TODO Auto-generated method stub
		return librosRepository.findAll();
	}

	

}
