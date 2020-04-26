package application;

import java.util.Scanner;

import entities.Veiculos;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Veiculos veiculos;
		
		double valor = 1.0;
		
		do {
			System.out.print("Informe o valor do veículo: R$");
			valor = sc.nextDouble();
			System.out.print("Tipo de combustível:\n[A]-Alcool\n[G]-Gasolina\n[D]-Diesel\nOpção: ");
			char tipoDoCombustivel = sc.next().toUpperCase().charAt(0);
			veiculos = new Veiculos(valor, tipoDoCombustivel);
			System.out.println("Valor do desconto: R$" + veiculos.desconto());
			System.out.println("Valor a ser pago pelo cliente: R$" + veiculos.valorDoVeiculoComDesconto());
			Veiculos.totalDeDesconto += veiculos.desconto();
			Veiculos.totalPago += veiculos.valorDoVeiculoComDesconto();
			System.out.println();
		} while(valor != 0.0);
		
		System.out.println();
		System.out.println(veiculos);

	}

}
