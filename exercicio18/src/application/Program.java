package application;

import java.util.Random;

import entities.MaiorIdade;

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random(80);
		MaiorIdade maiorIdade = new MaiorIdade();
		
		for(int i = 1; i <= 75; i++) {
			int idade = random.nextInt(90);
			System.out.print(idade + " - " + maiorIdade.ehMaiorDeIdade(idade));
		}

	}

}
