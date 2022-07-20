package com.gabe;

import com.gabe.model.Gato;

public class FistProgram {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);

	}

}

class Livros {
	private String nome;
	private String npag;

}
