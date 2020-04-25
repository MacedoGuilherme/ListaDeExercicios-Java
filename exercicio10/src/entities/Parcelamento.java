package entities;

public class Parcelamento {
	
	public static final int quantidadeDeParcelas = 5;
	
	private Double valorDaCompra;

	public Parcelamento(Double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}

	public Double getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(Double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	
	public Double valorDasParcelas() {
		return getValorDaCompra() / quantidadeDeParcelas;
	}

	public String toString() {
		return "Valor da Compra: R$" +
			getValorDaCompra() +
			"\nValor de cada parcela(5x): R$" +
			String.format("%.2f", valorDasParcelas());
	}
}
