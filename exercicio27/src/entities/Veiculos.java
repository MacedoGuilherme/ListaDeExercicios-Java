package entities;

public class Veiculos {
	
	public static Double totalDeDesconto = 0.0;
	public static Double totalPago = 0.0;
	
	private Double valor;
	private char tipoDoCombustivel;
	
	public Veiculos(Double valor, char tipoDoCombustivel) {
		this.valor = valor;
		this.tipoDoCombustivel = tipoDoCombustivel;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public char getTipoDoCombustivel() {
		return tipoDoCombustivel;
	}

	public void setTipoDoCombustivel(char tipoDoCombustivel) {
		this.tipoDoCombustivel = tipoDoCombustivel;
	}
	
	public Double desconto() {
		if(getTipoDoCombustivel() == 'A') {
			return getValor() * 0.25;
		} else if(getTipoDoCombustivel() == 'G') {
			return getValor() * 0.21;
		} else if(getTipoDoCombustivel() == 'D') {
			return getValor() * 0.14;
		} else {
			return 0.0;
		}
	}
	
	public Double valorDoVeiculoComDesconto() {
		return getValor() - desconto();
	}
	
	public String toString() {
		return "Total de desconto: R$" +
			totalDeDesconto +
			"\nTotal pago pelos clientes: R$" +
			totalPago;
	}

}
