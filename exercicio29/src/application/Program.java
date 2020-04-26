package application;

import java.util.Scanner;

import entities.Mes;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Mes mes = new Mes(5);
		
		System.out.println(mes.mesCorrespondente());

	}

}
