package program;

import entities.Conversor;

public class Aplication {
	
	public static final double cotacao = 5.35;
	public static final double quantidadeDollar = 20;

	public static void main(String[] args) {
		
		Conversor conversor = new Conversor(cotacao, quantidadeDollar);
		
		System.out.println(conversor);

	}

}
