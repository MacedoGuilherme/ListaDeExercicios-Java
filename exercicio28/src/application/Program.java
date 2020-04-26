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
			System.out.print("Salário: R$");
			Double salario = sc.nextDouble();
			System.out.print("Salário Mínimo: R$");
			Double salarioMinimo = sc.nextDouble();
			Funcionario funcionario = new Funcionario(nome, salario, salarioMinimo);
			System.out.println(funcionario);
			System.out.println();
			System.out.print("Deseja continuar? [S/N]: ");
			continuar = sc.next().toUpperCase().charAt(0);
			System.out.println();
			Funcionario.aumentoFolhaDePagamento += funcionario.reajuste();
		} while(continuar == 'S');
		
		System.out.println("Aumento na folha de pagamento: R$"+Funcionario.aumentoFolhaDePagamento);

	}

}
