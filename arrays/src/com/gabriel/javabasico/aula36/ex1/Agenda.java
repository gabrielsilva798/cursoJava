package com.gabriel.javabasico.aula36.ex1;

public class Agenda {
	private String nome;
	private Contato contatos[];
	
	public void retoneDados() {
		System.out.printf("Nome da Agenda: %s%n", nome);
		
		for(int i = 0; i < contatos.length; i++) {
			System.out.printf("----------CONTATO NUMERO %d--------------%n", i);
			System.out.printf("Nome: %s%n",contatos[i].getNome());
			System.out.printf("Telefone: %d%n",contatos[i].getTelefone());
			System.out.printf("Email: %s%n",contatos[i].getEmail());
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setContato(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public Contato[] getContato() {
		return this.contatos;
	}
}
