package application;

import java.util.Scanner;

import entities.Mencao;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Mencao notas = new Mencao("Guilherme", 1326308, 6.0, 7.5, 5.0);
	
		System.out.println(notas);
	}

}
