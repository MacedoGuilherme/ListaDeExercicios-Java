package entities;

public class Conversor {
	
	private Double cotacao;
	private Double quantidadeDollar;
	
	public Conversor(Double cotacao, Double quantidadeDollar) {
		this.cotacao = cotacao;
		this.quantidadeDollar = quantidadeDollar;
	}

	public Double getCotacao() {
		return cotacao;
	}

	public void setCotacao(Double cotacao) {
		this.cotacao = cotacao;
	}

	public Double getQuantidadeDollar() {
		return quantidadeDollar;
	}

	public void setQuantidadeDollar(Double quantidadeDollar) {
		this.quantidadeDollar = quantidadeDollar;
	}
	
	public Double conversao() {
		return quantidadeDollar * cotacao;
	}
	
	public String toString() {
		return "$" +
			getQuantidadeDollar() +
			"\nCotação: " +
			getCotacao() +
			"\n\nValor em R$: "
			+ String.format("%.2f", conversao());
	}

}
