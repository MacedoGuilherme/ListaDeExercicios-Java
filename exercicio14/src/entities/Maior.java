package entities;

public class Maior {
	
	private Integer numero1;
	private Integer numero2;
	
	public Maior(Integer numero1, Integer numero2) throws Exception {
		if(numero1 != numero2) {
			this.numero1 = numero1;
			this.numero2 = numero2;
		} else {
			throw new Exception();
		}
		
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
	
	public Integer maiorNumero() {
		if(numero1 > numero2) {
			return numero1;
		} else {
			return numero2;
		}
	}
	
	public String toString() {
		return "O maior valor entre " +
			numero1 +
			" e " +
			numero2 +
			" é : " +
			maiorNumero();
	}

}
