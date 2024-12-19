package com.evaluacion2.modulo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bibliotecario {

	@Autowired
	IAyudante ayudante;

	public void solicitanTodosLosLibros() {
		System.out.println("Listado de todos los libros:");
		ayudante.obtenerLibros().forEach(libro->System.out.println(libro.getTitulo()));
	}

	public void agregarUnLibro(Libro libro) {
		ayudante.agregarLibro(libro);
		System.out.println("Libro agregado: " + libro.getTitulo());
	}

	public void devolucionOPrestamoDeLibro(int id) {
		Libro libro = ayudante.cambiarDisponibilidad(id);
		System.out.println("Estado cambiado: " + libro.getTitulo() + " -> Disponible: " + libro.isDisponible());
}

	public void buscarLibro(String frase) {
		System.out.println("Resultado de búsqueda: ");
		ayudante.buscarLibro(frase).forEach(libro->System.out.println(libro.getTitulo()));
	}

}
