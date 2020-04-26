package entities;

public class Funcionario {
	
	private String nome;
	private Integer idade;
	private char sexo;
	private Double salarioFixo;
	
	public Funcionario(String nome, Integer idade, char sexo, Double salarioFixo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salarioFixo = salarioFixo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(Double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	public Double abono() {
		if(sexo == 'M') {
			if(idade >= 30) {
				return 100.00;
			} else {
				return 50.00;
			}
		} else if(sexo == 'F') {
			if(idade >= 30) {
				return 200.00;
			} else {
				return 80.00;
			}
		} else {
			return 0.0;
		}
	}
	
	public Double salarioLiquido() {
		return getSalarioFixo() + abono();
	}
	
	public String toString() {
		return "Nome: " +
			getNome() +
			"\nSalário Líquido: R$" +
			salarioLiquido();
	}

}
