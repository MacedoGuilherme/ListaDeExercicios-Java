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
	
	public String escritaPorExtenso() {
		String escrita = "";
		switch (getNumero()) {
		case 1:
			escrita = "Um";
			break;
		case 2:
			escrita = "Dois";
			break;
		case 3:
			escrita = "Três";
			break;
		case 4:
			escrita = "Quatro";
			break;
		case 5:
			escrita = "Cinco";
			break;
		default:
			escrita = "Número Inválido";
			break;
		}
		return escrita;
	}

}
