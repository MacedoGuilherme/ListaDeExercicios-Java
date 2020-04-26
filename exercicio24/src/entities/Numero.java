package entities;

public class Numero {
	
	private Integer numero;

	public Numero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String resultado() {
		if(getNumero() > 0) {
			return "Positivo";
		} else if(getNumero() < 0) {
			return "Negativo";
		} else {
			return "Zero";
		}
	}
	
	public String toString() {
		return resultado();
	}

}
