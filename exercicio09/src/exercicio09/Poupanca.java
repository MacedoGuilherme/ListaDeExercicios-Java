package exercicio09;

public class Poupanca {
	
	private Double amount;

	public Poupanca(Double amount) {
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double rendimento() {
		this.amount += 0.07;
		return getAmount();
	}
	
	public String toString() {
		return "Valor atualizado: R$" +
			String.format("%.2f", rendimento());
	}
	
}
