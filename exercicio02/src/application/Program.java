package application;

import entities.Calculador;

public class Program {
	
	public static final Integer number1 = 5;
	public static final Integer number2 = 2;

	public static void main(String[] args) {
		
		Calculador calc = new Calculador();
		
		System.out.println("Soma:");
		System.out.printf("%d + %d = %.2f%n", number1, number2, calc.showSum(number1, number2));
		System.out.println("Subtração:");
		System.out.printf("%d - %d = %.2f%n", number1, number2, calc.showSubtraction(number1, number2));
		System.out.println("Divisão:");
		System.out.printf("%d * %d = %.2f%n", number1, number2, calc.showMultiplication(number1, number2));
		System.out.println("Multiplicação:");
		System.out.printf("%d / %d = %.2f%n", number1, number2, calc.showDivision(number1, number2));

	}

}
