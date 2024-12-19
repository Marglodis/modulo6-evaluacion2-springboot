package com.evaluacion2.modulo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecarioEvaluacion2Modulo6Application implements CommandLineRunner{

	@Autowired
	private Bibliotecario bibliotecario;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecarioEvaluacion2Modulo6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Crear libros
		System.out.println("\nAgregando libros:");
		bibliotecario.agregarUnLibro(new Libro(1, "Spring Boot Essentials", new Autor("John", "Doe"), new Editorial("SpringPress","USA"),300,"Tecnología", false));
		bibliotecario.agregarUnLibro(new Libro(2, "Clean Code", new Autor("Robert", "Martin"), new Editorial("Prentice Hall", "USA"), 450, "Software", false));
        bibliotecario.agregarUnLibro(new Libro(3, "Java 17 in Action", new Autor("Jane", "Smith"), new Editorial("TechPub", "UK"), 500, "Java", true));
        bibliotecario.agregarUnLibro(new Libro(4, "The Pragmatic Programmer", new Autor("Andrew", "Hunt"), new Editorial("O'Reilly", "USA"), 320, "Programación", false));

        System.out.println();
        //Solicitar todos los libros
        bibliotecario.solicitanTodosLosLibros();
        
        System.out.println();
        //Cambiar Disponibilidad
        bibliotecario.devolucionOPrestamoDeLibro(1);
        bibliotecario.devolucionOPrestamoDeLibro(3);
        
        System.out.println();
        //Buscar libros
        bibliotecario.buscarLibro("Java");
	}

}
