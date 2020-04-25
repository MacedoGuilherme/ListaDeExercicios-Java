package entities;

public class Veiculo {
	
	public static Integer totalDeVeiculosMenorDe2000 = 0;
	public static Integer totalDeVeiculos = 0;
	
	private Integer ano;
	private Double valorVeiculo;
	
	public Veiculo(Integer ano, Double valorVeiculo) {
		this.ano = ano;
		this.valorVeiculo = valorVeiculo;
		if(ano < 2000) {
			totalDeVeiculosMenorDe2000++;
		}
		totalDeVeiculos++;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getVeiculo() {
		return valorVeiculo;
	}

	public void setVeiculo(Double veiculo) {
		this.valorVeiculo = veiculo;
	}
	
	public Double valorDoDesconto() {
		double desconto = 0;
		if(getAno() <= 2000) {
			desconto += valorVeiculo * 0.12;
		} else if(getAno() > 2000) {
			desconto += valorVeiculo * 0.07;
		}
		return desconto;
	}
	
	public String toString() {
		return "Valor do veículo com desconto R$:" +
			+ (valorDoDesconto() + valorVeiculo);
	}

}
