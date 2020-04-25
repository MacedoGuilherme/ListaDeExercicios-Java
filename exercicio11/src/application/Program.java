package application;

import entities.Produto;

public class Program {
	
	public static final Double precoDeCusto = 99.0;
	public static final Double percentualDeLucro = 10.0;

	public static void main(String[] args) {
		
		Produto produto = new Produto(precoDeCusto, percentualDeLucro);
		
		System.out.println(produto);
		
	}

}
