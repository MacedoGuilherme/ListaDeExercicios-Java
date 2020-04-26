package entities;

public class Produto {
	
	public static Integer mediaPrecoDeCusto = 0;
	public static Integer mediaPrecoDeVenda = 0;
	
	private Integer precoDeCusto;
	private Integer precoDeVenda;
	
	public Produto(Integer precoDeCusto, Integer precoDeVenda) {
		this.precoDeCusto = precoDeCusto;
		this.precoDeVenda = precoDeVenda;
	}

	public Integer getPrecoDeCusto() {
		return precoDeCusto;
	}

	public void setPrecoDeCusto(Integer precoDeCusto) {
		this.precoDeCusto = precoDeCusto;
	}

	public Integer getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(Integer precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	
	public String resultados() {
		if(getPrecoDeVenda() > getPrecoDeCusto()) {
			return "Lucro";
		} else if(getPrecoDeVenda() < getPrecoDeCusto()) {
			return "Prejuízo";
		} else {
			return "Empate";
		}
	}

}
