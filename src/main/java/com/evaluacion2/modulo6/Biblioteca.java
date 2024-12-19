package com.evaluacion2.modulo6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Biblioteca {
	List<Libro> libros = new ArrayList<>();
	
	public void agregarLibro(Libro libro) {
		libros.add(libro);
	}
	
	public List<Libro> getLibros(){
		return libros;
	}
}
