package arraydeobjeto;

import java.util.Arrays;

public class Turma {

	String identificacao;
	String nomeProfessora;
	Aluno[] alunos = new Aluno[0];
	
	void adcionarAluno(Aluno aluno) {
		this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
		this.alunos[this.alunos.length - 1] = aluno;
	}

	void imprimirListaDeAlunos() {
		for (int i = 0; i < alunos.length; i++) {
			//variável local para reduzir o tamanho do código.
			if (alunos != null) {
				System.out.printf("%d - %s (%d anos)%n", i, alunos[i].nome, alunos[i].idade);
			} else {
				System.out.println("Vago.");
				continue;
			}
		}
	}
}
