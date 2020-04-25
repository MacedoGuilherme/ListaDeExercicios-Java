package application;

import entities.Consumo;

public class Program {
	
	public static final Double combustivelGasto = 6.75;
	public static final Double distanciaTotal = 60.0;

	public static void main(String[] args) {
		
		Consumo consumo = new Consumo();
		
		System.out.printf("O consumo médio é de %.2f km/l", consumo.consumoMedio(combustivelGasto, distanciaTotal));

	}

}
