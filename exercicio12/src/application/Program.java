package application;

import entities.Custo;

public class Program {
	
	private static final Double custoDeFabrica = 10000.00;

	public static void main(String[] args) {
		
		Custo custo = new Custo(custoDeFabrica);
		
		System.out.println(custo);

	}

}
