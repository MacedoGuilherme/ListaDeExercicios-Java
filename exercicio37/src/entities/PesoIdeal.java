package entities;

public class PesoIdeal {
	
	private String nome;
	private char sexo;
	private Double altura;
	private Integer idade;
	
	public PesoIdeal(String nome, char sexo, Double altura, Integer idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Double pesoIdeal() {
		if(altura > 1.70 && idade <= 20) {
			return (72.7 * altura) - 58;
		}else if(sexo == 'M' && altura > 1.70 && (idade >= 21 || idade <= 39)) {
			return (72.7 * altura) - 53;
		}else if(sexo == 'M' && altura <= 1.70 && idade >= 40) {
			return (72.7 * altura) -45;
		}else if(sexo == 'F' && altura > 1.50) {
			return (62.1 * altura) - 44.7;
		}else if(sexo == 'F' && altura <= 1.50 && idade >= 35) {
			return (62.1 * altura) - 45.7;
		}else if(sexo == 'F' && altura <= 1.50 && idade < 35) {
			return (62.1 * altura) - 49;
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		return "Peso ideal: " +
			String.format("%.2f", pesoIdeal()) +
			" KG";
	}
	

}
