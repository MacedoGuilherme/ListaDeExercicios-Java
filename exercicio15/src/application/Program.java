package application;

import entities.Intervalo;

public class Program {
	
	private static final Integer numero = 135; 

	public static void main(String[] args) {
		
		Intervalo intervalo = new Intervalo(numero);
		
		System.out.println(intervalo);

	}

}
