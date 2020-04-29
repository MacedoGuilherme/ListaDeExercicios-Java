package entities;

public class CategoriaDoSeguro {
	
	private String nome;
	private Integer idade;
	private char grupoDeRisco;
	
	public CategoriaDoSeguro(String nome, Integer idade, char grupoDeRisco) {
		this.nome = nome;
		this.idade = idade;
		this.grupoDeRisco = grupoDeRisco;
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

	public char getGrupoDeRisco() {
		return grupoDeRisco;
	}

	public void setGrupoDeRisco(char grupoDeRisco) {
		this.grupoDeRisco = grupoDeRisco;
	}
		
	public Integer determinarCategoriaDoAssegurado() {
		if(idade >= 17 && idade <= 70) {
			if(idade >= 17 && idade <= 20) {
				if(grupoDeRisco == 'B') {
					return 1;
				}else if(grupoDeRisco == 'M') {
					return 2;
				}else {
					return 3;
				}
			}else if(idade >= 21 && idade <= 24) {
				if(grupoDeRisco == 'B') {
					return 2;
				}else if(grupoDeRisco == 'M') {
					return 3;
				}else {
					return 4;
				}
			}else if(idade >= 25 && idade <= 34) {
				if(grupoDeRisco == 'B') {
					return 3;
				}else if(grupoDeRisco == 'M') {
					return 4;
				}else {
					return 5;
				}
			}else if(idade >= 35 && idade <= 64) {
				if(grupoDeRisco == 'B') {
					return 4;
				}else if(grupoDeRisco == 'M') {
					return 5;
				}else {
					return 6;
				}
			} else if(idade >= 65 && idade <= 70) {
				if(grupoDeRisco == 'B') {
					return 7;
				}else if(grupoDeRisco == 'M') {
					return 8;
				}else {
					return 9;
				}
			} else {
				return 0;
			}
		}else {
			return 0;
		}
	}
	
	public String validarCategoriaDoAssegurado() {
		if(determinarCategoriaDoAssegurado().equals(0)) {
			return "Não é possível adquirir a apólice de seguro.";
		} else {
			return toString();
		}
	}
	
	public String toString() {
		return "Nome: " +
			nome +
			"\nIdade: " +
			idade +
			"\nCategoria do Pretendente: " +
			determinarCategoriaDoAssegurado();
	}

}
