package application;

import java.util.Scanner;

import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char continuar = 'n';
		
		do {
			System.out.print("Informe o ano do veículo: ");
			Integer ano = sc.nextInt();
			System.out.print("Informe o valor do veículo: ");
			Double valorVeiculo = sc.nextDouble();
			Veiculo veiculo = new Veiculo(ano, valorVeiculo);
			System.out.println(veiculo);
			System.out.print("Deseja continuar? [S/N]: ");
			continuar = sc.next().toUpperCase().charAt(0);
			System.out.println();
		} while(continuar == 'S');
		
		System.out.println("Veículos com ano até 2000: " + Veiculo.totalDeVeiculosMenorDe2000);
		System.out.println("Total de veículos: " + Veiculo.totalDeVeiculos);
	}

}
