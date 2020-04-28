package application;

import entities.OperacaoAritmetica;

public class Program {

	public static void main(String[] args) {
		
		OperacaoAritmetica op = new OperacaoAritmetica(0.0, 2.0, '/');
		
		System.out.println(op.isOperator());

	}

}
