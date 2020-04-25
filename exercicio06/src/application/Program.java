package application;

import entities.Trocar;

public class Program {
	
	private static final int variavelA = 8;
	private static final int variavelB = 5;

	public static void main(String[] args) {
		
		Trocar trocar = new Trocar(variavelA, variavelB);
		
		System.out.println("Valores antes da troca: ");
		System.out.println("Variável A: " + trocar.getVariavelA());
		System.out.println("Variável B: " + trocar.getVariavelB());
		
		System.out.println();
		
		trocar.trocaDeValores();
		
		System.out.println("Valores após a troca: ");
		System.out.println(trocar);

	}

}
