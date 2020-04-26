package entities;

public class Pessoas {
	
	public static Integer totalAptos = 0;
	
	private String nome;
	private char sexo;
	private Integer idade;
	private boolean saude;
	
	public Pessoas(String nome, char sexo, Integer idade, boolean saude) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.saude = saude;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public boolean isSaude() {
		return saude;
	}

	public void setSaude(boolean saude) {
		this.saude = saude;
	}
	
	public boolean ehApto() {
		if(getIdade() >= 18 && isSaude() == true && getSexo() == 'M') {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Total de pessoas aptas: " +
		totalAptos;
	}
	
	

}
