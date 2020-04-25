package program;

import entities.Vendedor;

public class Application {

	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor("Guilherme Macedo", 1000.0, 15000.00);
		
		vendedor.calcSalario();
		
		System.out.println(vendedor);

	}

}