package entities;

public class Trocar {
	
	private Integer variavelA;
	private Integer variavelB;
	
	public Trocar(Integer variavelA, Integer variavelB) {
		this.variavelA = variavelA;
		this.variavelB = variavelB;
	}

	public Integer getVariavelA() {
		return variavelA;
	}

	public void setVariavelA(Integer variavelA) {
		this.variavelA = variavelA;
	}

	public Integer getVariavelB() {
		return variavelB;
	}

	public void setVariavelB(Integer variavelB) {
		this.variavelB = variavelB;
	}
	
	public void trocaDeValores() {
		int aux = variavelA;
		this.variavelA = getVariavelB();
		this.variavelB = aux;
	}
	
	public String toString() {
		return "Variável A: " +
		getVariavelA() +
		"\nVariável B: " +
		getVariavelB();
	}

}
