package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char continuar = 'S';
		
		do {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			Integer idade = sc.nextInt();
			System.out.print("Sexo [M/F]: ");
			char sexo = sc.next().toUpperCase().charAt(0);
			System.out.print("Salário Fixo: R$");
			double salarioFixo = sc.nextDouble();
			Funcionario funcionario = new Funcionario(nome, idade, sexo, salarioFixo);
			System.out.println();
			System.out.println(funcionario);
			System.out.println();
			System.out.print("Deseja continuar? [S/N]: ");
			continuar = sc.next().toUpperCase().charAt(0);
			System.out.println();
		}while(continuar == 'S');

	}

}
