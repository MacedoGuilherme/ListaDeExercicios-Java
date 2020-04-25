package application;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Guilherme", 80.0, 70.0, 60.0);
			System.out.println(aluno);
		} catch (Exception e) {
			System.out.println("ERRO: Verificar notas digitadas!");
		}
		
		
		
	}

}
