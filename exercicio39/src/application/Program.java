package application;

import entities.CategoriaDoSeguro;

public class Program {

	public static void main(String[] args) {
		
		CategoriaDoSeguro categoriaDoSeguro = new CategoriaDoSeguro("Guilherme", 23, 'A');
		
		System.out.println(categoriaDoSeguro.validarCategoriaDoAssegurado());
	}

}
