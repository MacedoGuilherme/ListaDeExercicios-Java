package application;

import entities.Maior;

public class Program {
	
	public static final Integer numero1 = 5;
	public static final Integer numero2 = 8;

	public static void main(String[] args) {
		
		try {
			Maior maior = new Maior(numero1, numero2);
			System.out.println(maior);
		} catch(Exception e) {
			System.out.println("Números iguais !");
		}

	}

}
