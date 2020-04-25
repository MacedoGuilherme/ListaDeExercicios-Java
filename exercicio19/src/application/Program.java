package application;

import java.util.Random;

import exercicio19.QuantidadeDeGenero;

public class Program {

	public static void main(String[] args) {
		
		QuantidadeDeGenero generos = new QuantidadeDeGenero();
		Random random = new Random();
		
		String chars = "FM";
		char sexo = 'C';
		
		for(int i = 0; i < 56; i++) {
			sexo = chars.charAt(random.nextInt(chars.length()));
			System.out.println("Nome: Guilherme(a)");
			System.out.print("Sexo: ");
			System.out.println(sexo);
			generos.quantidadesDeGenero(sexo);
		}
		
		System.out.println(generos);

	}

}
