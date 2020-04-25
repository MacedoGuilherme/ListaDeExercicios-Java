package entities;

import java.util.ArrayList;

public class MediaAritmetica {
	
	private String nome;
	
	ArrayList<Double> notas = new ArrayList<Double>();

	public MediaAritmetica(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Double> getNotas() {
		return notas;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNotas(Double nota) {
		notas.add(nota);
	}

	public Double mediaDasNotas() {
		Double sum = 0.0;
		Integer aux = 0;
		for (Double nota : notas) {
			sum += nota;
			aux++;
		}
		return sum / aux;
	}
	
	public String mencao() {
		if(mediaDasNotas() >= 70.0) {
			return "Aprovado";
		} else if(mediaDasNotas() < 70.0 && mediaDasNotas() > 50.0) {
			return "Recuperação";
		} else if(mediaDasNotas() <= 50.0 && mediaDasNotas() >= 0.0) {
			return "Reprovado";
		} else {
			return  "Notas inválidas";
		}
	}
	
	public String toString() {
		int aux = 1; 
		for (Double notas : notas) {
			System.out.print(aux +
				"ª Nota: " +
				notas +
				"\n");
			aux++;
		}
		return "\nStatus: " +
		mencao();
	}

}
