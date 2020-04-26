package entities;

public class Funcionario {
	
	public static Double aumentoFolhaDePagamento = 0.0;
	
	private String nome;
	private Double salario;
	private Double salarioMinimo;
	
	public Funcionario(String nome, Double salario, Double salarioMinimo) {
		this.nome = nome;
		this.salario = salario;
		this.salarioMinimo = salarioMinimo;
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
	
	public Double getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	public Double reajuste() {
		if(getSalario() < (getSalarioMinimo() * 3)) {
			return getSalario() * 0.50;
		} else if(getSalario() >= (getSalarioMinimo() * 3) && getSalario() <= (getSalarioMinimo() * 10)) {
			return  getSalario() * 0.20;
		} else if(getSalario() > (getSalarioMinimo() * 10) && getSalario() <= (getSalarioMinimo() * 20)) {
			return getSalario() * 0.15;
		} else {
			return getSalario() * 0.10;
		}
	}
	
	public 	Double novoSalario() {
		return getSalario() + reajuste();
	}
	
	public String toString() {
		return "\nNome: " +
			getNome() +
			"\nReajuste: R$" +
			reajuste() +
			"\nNovo Sálario: R$" +
			novoSalario();
	}
}
