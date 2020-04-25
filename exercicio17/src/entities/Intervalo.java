package entities;

import java.util.ArrayList;

public class Intervalo {
	
	private Integer numero;
	private Integer quantidade;
		
	public Intervalo() {
		this.quantidade = 0;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void quantidadeNoIntervalo(Integer numero) {
		int aux = 0;
		if(numero >= 10 && numero <= 150) {
			aux++;
			this.quantidade += aux;
		}
	}
	
	public String toString() {
		return "\nQuantidades de números no intervalo entre 10(inclusive) e 150(inclusive): " +
			+ getQuantidade();
	}

}
