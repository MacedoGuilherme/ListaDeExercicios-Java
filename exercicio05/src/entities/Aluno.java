package entities;

public class Aluno {
	
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double nota3;
	
	public Aluno(String nome, Double nota1, Double nota2, Double nota3) throws Exception {
		this.nome = nome;
		if((nota1 >= 0 && nota1 <= 100) && (nota2 >= 0 && nota2 <= 100) && (nota3 >= 0 && nota3 <= 100)) {
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
		} else {
			throw new Exception();
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	
	public Double mediaNota() {
		return (getNota1() + getNota2() + getNota3()) / 3;
	}

	@Override
	public String toString() {
		return "Aluno: " + getNome() + "\nMédia das Nota: " + String.format("%.2f", mediaNota());
	}
	
	

}
