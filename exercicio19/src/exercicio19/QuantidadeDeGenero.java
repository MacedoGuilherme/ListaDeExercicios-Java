package exercicio19;

public class QuantidadeDeGenero {
	
	private String nome;
	private int homens;
	private int mulheres;
	
	public QuantidadeDeGenero() {
		this.homens = 0;
		this.mulheres = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHomens() {
		return homens;
	}

	public void setHomens(char homens) {
		this.homens = homens;
	}

	public int getMulheres() {
		return mulheres;
	}

	public void setMulheres(char mulheres) {
		this.mulheres = mulheres;
	}

	public void quantidadesDeGenero(char sexo) {
		if(sexo == 'M') {
			this.homens++;
		}else if(sexo == 'F') {
			this.mulheres++;
		}
	}
	
	public String toString() {
		return "Quantidade de Homens: " +
			getHomens() +
			"\nQuantidade de Mulheres: " +
			getMulheres();
	}

}
