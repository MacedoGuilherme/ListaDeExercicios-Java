package entities;

public class Mencao {
	
	private String nome;
	private Integer matricula;
	private Double notaLaboratorio;
	private Double notaAvaliacaoSemestral;
	private Double notaExameFinal;
	
	public Mencao(String nome, Integer matricula, Double notaLaboratorio, Double notaAvaliacaoSemestral,
			Double notaExameFinal) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaLaboratorio = notaLaboratorio;
		this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
		this.notaExameFinal = notaExameFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Double getNotaLaboratorio() {
		return notaLaboratorio;
	}

	public void setNotaLaboratorio(Double notaLaboratorio) {
		this.notaLaboratorio = notaLaboratorio;
	}

	public Double getNotaAvaliacaoSemestral() {
		return notaAvaliacaoSemestral;
	}

	public void setNotaAvaliacaoSemestral(Double notaAvaliacaoSemestral) {
		this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
	}

	public Double getNotaExameFinal() {
		return notaExameFinal;
	}

	public void setNotaExameFinal(Double notaExameFinal) {
		this.notaExameFinal = notaExameFinal;
	}
	
	public Double notaFinal() {
		return ((notaLaboratorio * 2) + (notaAvaliacaoSemestral * 3) + (notaExameFinal * 5)) / 10;
	}
	
	public String conceito() {
		if(notaFinal() >= 9.0) {
			return "DA2";
		}else if(notaFinal() >= 8.0) {
			return "DA1";
		}else if(notaFinal() >= 7.0) {
			return "DCA2";
		}else if(notaFinal() >= 6.0) {
			return "DCA1";
		}else if(notaFinal() >= 5.0) {
			return "NI2";
		}else if(notaFinal() < 5.0 && notaFinal() >= 0) {
			return "NI1";
		}else {
			return "Conceito inválido! Verificar notas informadas";
		}
	}
	
	public String mencao() {
		if((conceito().equals("DA2")) || (conceito().equals("DA1")) || (conceito().equals("DCA2"))) {
			return "APTO";
		}else if((conceito().equals("DCA1")) || (conceito().equals("NI2")) || (conceito().equals("NI1"))) {
			return "NÃO APTO";
		}else {
			return "Menção inválido! Verificar notas informadas";
		}
	}
	
	public String toString() {
		return "Aluno: " +
			getNome() + 
			"\nMatrícula: " +
			getMatricula() +
			"\nNota Final: " +
			String.format("%.1f", notaFinal()) +
			"\nConceito: " +
			conceito() +
			"\nMenção: " +
			mencao();
	}

}
