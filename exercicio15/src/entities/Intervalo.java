package entities;

public class Intervalo {
	
	private Integer numero;
	
	public Intervalo(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String estaNoIntervalo() {
		if(getNumero() >= 100 && getNumero() <= 200) {
			return "está no intervalo de 100 a 200.";
		} else {
			return "não está no intervalo de 100 a 200.";
		}
	}
	
	public String toString() {
		return "O número " +
			getNumero() +
			" " +
			estaNoIntervalo();
	}

}
