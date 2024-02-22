package gabriel.com.array.aula7.aobjeto.copiar_espandir;

public class Turma {
	String identificacao;
	String nomeProfessora;
	Aluno[] alunos;
	
	void imprimirListasAlunos() {
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i] != null) {
				System.out.printf("%d - %s (%d anos)%n", i, alunos[i].nome, 
						alunos[i].idade);
			}
		}
	}
}
