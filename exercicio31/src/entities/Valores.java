package entities;

public class Valores {
	
	private Integer[] numeros = new Integer[3];

	public Valores(Integer[] numeros) {
		this.numeros = numeros;
	}

	public Integer[] getNumeros() {
		return numeros;
	}

	public void setNumeros(Integer[] numeros) {
		this.numeros = numeros;
	}

	public void odernacao() {
		int aux;
		for(int i = 0; i <= numeros.length; i++) {
			for(int j = i+1; j <= numeros.length -1; j++) {
				if(numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
	}
	
	public void showResult() {
		System.out.println("Números ordenados:");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	
}
