package com.gabriel.javabasico.aula36.ex1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Contato contatos[] = new Contato[3];
		Agenda agenda = new Agenda();

		System.out.println("Insira o nome da agenda: ");
		agenda.setNome(scan.nextLine());


		for(int i = 0; i < contatos.length; i++) {
			contatos[i] = new Contato();
			System.out.println("insira o nome do contato "+ i + ".");
			contatos[i].setNome(scan.nextLine());

			System.out.println("insira o email do contato "+ i + ".");
			contatos[i].setEmail(scan.nextLine());
			
			System.out.println("insira o telefone do contato "+ i + ".");
			contatos[i].setTelefone(scan.nextInt());
			
			scan.nextLine();
		} 
		
		agenda.setContato(contatos);
		agenda.retoneDados();

		scan.close();
	}
}
