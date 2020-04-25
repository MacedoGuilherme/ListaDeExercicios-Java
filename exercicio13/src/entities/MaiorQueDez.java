package entities;

public class MaiorQueDez {
	
	private Integer numero;

	public MaiorQueDez(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean ehMaior() {
		if(getNumero() > 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		if(ehMaior()) {
			return getNumero() +
				" é maior que 10 !!!";
		} else {
			return "";
		}
	}
	
}
