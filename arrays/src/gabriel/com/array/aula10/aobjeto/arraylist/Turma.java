package gabriel.com.array.aula10.aobjeto.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma {
	String identificacao;
	String nomeProfessora;
	Aluno[] alunos1 = new Aluno[0]; //tipo ARRAY
	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); //tipo ARRAYLIST

	// O objeto antigo vai ser DESCARTADO, ele vai SOBRE-ESCREVER o antigo.
	// ADCIONANDO ELEMENTO EM ARRAY NORMAL.
	public void adcionarAluno(Aluno aluno) {
		this.alunos1 = Arrays.copyOf(this.alunos1, this.alunos1.length +1);
		alunos1[alunos1.length - 1] = aluno;
	}


	//ADCIONANDO ALUNO COM ARRAYLIST
	public void adcionarAlunoArrayList(Aluno aluno) {
		alunos.add(aluno);
	}


	void imprimirListasAlunos() {
		for(int i = 0; i < alunos1.length; i++) {
			if(alunos1[i] != null) {
				System.out.printf("%d - %s (%d anos)%n", i, alunos1[i].nome, 
						alunos1[i].idade);
			}
		}
	}

	void imprimirListasAlunosArrayList() {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i) != null) {
				System.out.printf("%d - %s (%d anos)%n", i, alunos.get(i) .nome, 
						alunos.get(i) .idade);
			}
		}

	}

	// REMOVENDO ELEMENTO DE ARRAY NORMAL
	public void removerElementos( int posicao) {
		Aluno[] resultado = new Aluno[alunos1.length - 1];

		for(int i = 0; i < alunos1.length; i++) {
			if(i == posicao) {
				continue;
			} else if(i > posicao) {
				resultado[i-1] = alunos1[i];
			} else {
				resultado[i] = alunos1[i];
			}
		}
		alunos1 =  resultado;

	}

	//REMOVENDO ELEMENTO DE ARRAYLIST, COM O .REMOVE(índice)
	public void removerElementosArrayList(int posicao) {
		alunos.remove(posicao);
	}
}