package exercicio34;

public class Professor {
	
	private Integer nivelDoProfessor;
	private Double horasTrabalhadas;
	
	public Professor(Integer nivelDoProfessor, Double horasTrabalhadas) {
		this.nivelDoProfessor = nivelDoProfessor;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Integer getNivelDoProfessor() {
		return nivelDoProfessor;
	}

	public void setNivelDoProfessor(Integer nivelDoProfessor) {
		this.nivelDoProfessor = nivelDoProfessor;
	}

	public Double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public Double valorGanhoPorHora() {
		if(nivelDoProfessor.equals(1)) {
			return 12.00;
		}else if(nivelDoProfessor.equals(2)) {
			return 17.00;
		} else if(nivelDoProfessor.equals(3)) {
			return 25.00;
		} else {
			return 0.0;
		}
	}

	public Double salario() {
		return valorGanhoPorHora() * horasTrabalhadas;
	}
	
	public String toString() {
		return "Sálario do professor: R$ "
				+ salario();
	}

}
