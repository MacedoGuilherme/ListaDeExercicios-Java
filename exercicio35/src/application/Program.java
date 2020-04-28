package application;

import entities.Nadador;

public class Program {

	public static void main(String[] args) {
		
		Nadador idadeNadador = new Nadador(4);
		
		System.out.println(idadeNadador.classificarCategoria());

	}

}
