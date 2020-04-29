package entities;

public class ContaDeLuz {
	
	private Integer tipoDeResidencia;
	private Double quilowattHora;
	
	public ContaDeLuz(Integer tipoDeResidencia, Double quilowattHora) {
		this.tipoDeResidencia = tipoDeResidencia;
		this.quilowattHora = quilowattHora;
	}

	public Integer getTipoDeResidencia() {
		return tipoDeResidencia;
	}

	public void setTipoDeResidencia(Integer tipoDeResidencia) {
		this.tipoDeResidencia = tipoDeResidencia;
	}

	public Double getQuilowattHora() {
		return quilowattHora;
	}

	public void setQuilowattHora(Double quilowattHora) {
		this.quilowattHora = quilowattHora;
	}

	public Double valorDaContaDeLuz() {
		if(tipoDeResidencia.equals(1)) {
			return quilowattHora * 0.60;
		}else if(tipoDeResidencia.equals(2)) {
			return quilowattHora * 0.48;
		}else if(tipoDeResidencia.equals(3)) {
			return quilowattHora * 1.29;
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "Valor da conta de luz: R$:" +
			valorDaContaDeLuz();
	}

}
