package gabriel.com.array.aula9.aobjeto.removendo_elementos;

import java.util.Arrays;

public class Turma {
	String identificacao;
	String nomeProfessora;
	Aluno[] alunos = new Aluno[0];
	
// O objeto antigo vai ser DESCARTADO, ele vai SOBRE-ESCREVER o antigo.	
	public void adcionarAluno(Aluno aluno) {
		this.alunos = Arrays.copyOf(this.alunos, this.alunos.length +1);
		alunos[alunos.length - 1] = aluno;
	}
	
	
	void imprimirListasAlunos() {
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				System.out.printf("%d - %s (%d anos)%n", i, alunos[i].nome, 
						alunos[i].idade);
			}
		}
	}
}
