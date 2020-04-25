package entities;

public class Vendedor {
	
	private String nome;
	private Double salario;
	private Double vendasTotal;

	public Vendedor(String nome, Double salario, Double vendasTotal) {
		this.nome = nome;
		this.salario = salario;
		this.vendasTotal = vendasTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getVendasTotal() {
		return vendasTotal;
	}

	public void setVendasTotal(Double vendasTotal) {
		this.vendasTotal = vendasTotal;
	}
	
	public Double calcSalario() {
		return getSalario() + (getVendasTotal() * 0.15);
	}
	
	public String toString() {
		return "Nome: " +
				getNome() +
				"\n" +
				"Sálario Fixo: " +
				getSalario() +
				"\n" +
				"Sálario ao Final do Mês: " +
				calcSalario();
	}

}
