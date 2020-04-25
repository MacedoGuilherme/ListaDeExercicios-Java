package application;

import java.util.Random;

import entities.Intervalo;

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random();
		Intervalo intervalo = new Intervalo();
		
		for(int i = 1; i <= 80; i++) {
			int numero = random.nextInt(200);
			System.out.println(numero);
			intervalo.quantidadeNoIntervalo(numero);
		}
		
		System.out.println(intervalo);
		

	}

}
