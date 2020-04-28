package application;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(4, 5, 6);
		
		System.out.println(triangulo.typeOfTriangle());

	}

}
