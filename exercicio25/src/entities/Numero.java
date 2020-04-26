package entities;

public class Numero {
	
	private Integer numero1;
	private Integer numero2;
	
	public Numero(Integer numero1, Integer numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}

	public boolean ehIguais() {
		if(getNumero1().equals(getNumero2())) {
			return true;
		} else {
			return false;
		}
	}
	
	public Integer maiorNumero() {
		if(getNumero1() > getNumero2()) {
			return getNumero1();
		} else {
			return getNumero2();
		}
	}
	
	public String toString() {
		if(ehIguais()) {
			return "Números iguais !";
		} else {
			return "O maior número é o: " + 
					maiorNumero() +
					"\nNúmeros diferentes!";
		}
	}
	

}
