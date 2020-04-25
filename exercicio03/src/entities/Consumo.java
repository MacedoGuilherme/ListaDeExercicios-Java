package entities;

public class Consumo {
	
	private Double distanciaTotal;
	private Double combustivelGasto;
	
	public Consumo() {
	}

	public Double getDistanciaTotal() {
		return distanciaTotal;
	}

	public void setDistanciaTotal(Double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}

	public Double getCombustivelTotal() {
		return combustivelGasto;
	}

	public void setCombustivelTotal(Double combustivelTotal) {
		this.combustivelGasto = combustivelTotal;
	}

	public Double consumoMedio(Double combustivelGasto, Double distanciaTotal) {
		return distanciaTotal/combustivelGasto;
	}
	

}
