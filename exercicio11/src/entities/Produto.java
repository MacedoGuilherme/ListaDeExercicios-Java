package entities;

public class Produto {
	
	private Double precoDeCusto;
	private Double percentualDeLucro;
	
	public Produto(Double precoDeCusto, Double percentualDeLucro) {
		this.precoDeCusto = precoDeCusto;
		this.percentualDeLucro = percentualDeLucro;
	}

	public Double getPrecoDeCusto() {
		return precoDeCusto;
	}

	public void setPrecoDeCusto(Double precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public Double getPercentualDeLucro() {
		return percentualDeLucro;
	}

	public void setPercentualDeLucro(Double percentualDeLucro) {
		this.percentualDeLucro = percentualDeLucro;
	}
	
	public Double valorDeVenda() {
		return this.precoDeCusto += getPrecoDeCusto() * (getPercentualDeLucro() / 100);
	}
	
	public String toString() {
		return "Preço de Custo: R$" +
			getPrecoDeCusto() +
			"\nPercentual de Lucro: " +
			getPercentualDeLucro() +
			"%" +
			"\nPreço de Venda: R$" +
			String.format("%.2f", valorDeVenda());
	}
	

}
