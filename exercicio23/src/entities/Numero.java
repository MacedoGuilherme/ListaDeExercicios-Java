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
	
	public String toString() {
		if(getNumero() > 80) {
			return "Número maior que 80";
		} else if(getNumero() < 25) {
			return "Número menor que 25";
		} else if (getNumero().equals(40)) {
			return "Número igual a 40";
		} else {
			return "";
		}
	}

}
