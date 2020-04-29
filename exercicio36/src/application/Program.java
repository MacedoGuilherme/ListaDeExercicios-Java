package application;

import java.util.Scanner;

import entities.ContaDeLuz;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n[1] - Residência\n[2] - Comércio\n[3] - Indústria\nInforme o tipo de residência: ");
		int tipoDeResidencia = sc.nextInt();
		System.out.print("Quantidade de  KW/h consumido: ");
		Double quilowattHora = sc.nextDouble();
		
		ContaDeLuz contaDeLuz = new ContaDeLuz(tipoDeResidencia, quilowattHora);
		
		System.out.println(contaDeLuz);

	}

}
