package application;

import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoas pessoas = null;
		boolean saude = false;
		
		System.out.print("Quantas pessoas deseja verificar ? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Sexo [M/F]: ");
			char sexo = sc.next().toUpperCase().charAt(0);
			System.out.print("Idade: ");
			Integer idade = sc.nextInt();
			System.out.print("Apto físicamente ? [0]-Sim / [1]-Não ");
			Integer saudavel = sc.nextInt();
			if(saudavel.equals(0)) {
				saude = true;
				pessoas = new Pessoas(nome, sexo, idade, saude);
			} else {
				pessoas = new Pessoas(nome, sexo, idade, saude);
			}
			if(pessoas.ehApto()) {
				Pessoas.totalAptos++;
			}
			System.out.println();
		}
		
		System.out.println(pessoas);

	}

}
