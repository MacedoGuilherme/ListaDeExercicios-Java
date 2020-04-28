package application;

import entities.Valores;

public class Program {

	public static void main(String[] args) {
		
		Valores valores = null;
		
		for(int i = 0; i < 3; i++) {
			Integer numeros[] = {25, 8, 50};
			
			valores = new Valores(numeros);
			
		}
		
		valores.odernacao();
		
		valores.showResult();
		

	}

}
