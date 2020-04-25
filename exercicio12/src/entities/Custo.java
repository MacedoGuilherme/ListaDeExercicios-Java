package entities;

public class Custo {
	
	public static final Double percentualDoDistribuidor = (double) 28;
	public static final Double impostos = (double) 45;
	
	private Double custoDeFabrica;

	public Custo(Double custoDeFabrica) {
		this.custoDeFabrica = custoDeFabrica;
	}
	
	public Double getCustoDeFabrica() {
		return custoDeFabrica;
	}
	
	public void setCustoDeFabrica(Double custoDeFabrica) {
		this.custoDeFabrica = custoDeFabrica;
	}
	
	public Double custoDoConsumidor() {
		Double aux = (this.custoDeFabrica += getCustoDeFabrica() * (impostos / 100));
		return aux += aux * (percentualDoDistribuidor / 100);
	}
	
	public String toString() {
		return "Custo de Fábrica: R$" +
			getCustoDeFabrica() +
			"\nPercentagem do Distribuidor: " +
			percentualDoDistribuidor +
			"%" +
			"\nImpostos: " +
			impostos +
			"%" +
			"\nCusto ao Consumidor: R$" +
			String.format("%.2f", custoDoConsumidor());
	}

}
