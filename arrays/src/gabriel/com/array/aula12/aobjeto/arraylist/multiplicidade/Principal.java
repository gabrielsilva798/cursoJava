package gabriel.com.array.aula12.aobjeto.arraylist.multiplicidade;

import java.util.ArrayList;

public class Principal {
	
	//          ARRAYLIST DA COLLECTIONS API
	// ARRAYLIST NÃO SUPORTA TIPO PRIMITIVO
	
	// NÃO PREISA ESPECIFICAR O TAMANHO DO ARRAYLIST
	public static void main(String[] args) {
		//opcional colocar o tipo dentro dos segundos <> ex: new ArrayList<String>()
		ArrayList<String> alunos = new ArrayList<>(); 
		alunos.add("João"); // para adcionar um elemento é ARRAYLIST.ADD(elemento a ser adc);
		alunos.add("Laura");
		alunos.get(0); // para pegar um valor do ARRAYLIST eu uso o .get(índice)
		
		// inves de LENGTH o arraylist recebe um método chamado SIZE()
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i)); ;
		}
		
		// com o FOR RESUMIDO é a mesma coisa
		for(String aluno: alunos) {
			System.out.println(aluno);
		}

	}
}
