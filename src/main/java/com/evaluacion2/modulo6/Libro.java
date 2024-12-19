package com.evaluacion2.modulo6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Libro {
	int id;
	String titulo;
	Autor autor;
	Editorial editorial;
	int pagina;
	String genero;
	boolean disponible;
}
