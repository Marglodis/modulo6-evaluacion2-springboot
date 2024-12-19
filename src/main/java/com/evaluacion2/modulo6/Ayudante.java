package com.evaluacion2.modulo6;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ayudante implements IAyudante {

	@Autowired
	Biblioteca biblioteca;

	@Override
	public List<Libro> buscarLibro(String frase) {

		return biblioteca.getLibros().stream().filter(libro -> libro.getTitulo().contains(frase))
				.collect(Collectors.toList());
	}

	@Override
	public List<Libro> obtenerLibros() {

		return biblioteca.getLibros();
	}

	@Override
	public void agregarLibro(Libro libro) {
		biblioteca.agregarLibro(libro);

	}

	@Override
	public Libro cambiarDisponibilidad(int id) {
		for (Libro libro : biblioteca.getLibros()) {
			if (libro.getId() == id) {
				libro.setDisponible(!libro.isDisponible());
				return libro;
			}
		}
		return null;
	}

}
