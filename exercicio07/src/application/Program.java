package application;

import entities.Conversor;

public class Program {
	
	private static final double celsius = 33.5;

	public static void main(String[] args) {
		
		Conversor conversor = new Conversor(celsius);
		
		System.out.println(conversor);

	}

}
