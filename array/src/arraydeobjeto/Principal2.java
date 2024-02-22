package arraydeobjeto;

import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {
		Turma turmaB = new Turma();
		turmaB.identificacao = "Maternal B";
		turmaB.nomeProfessora = "Tia Maria";
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		aluno1.idade = 3;
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Laura";
		aluno2.idade = 4;
		
		turmaB.adcionarAluno(aluno1);
		turmaB.adcionarAluno(aluno2);
	
		System.out.println(Arrays.toString(turmaB.alunos));
	}

}
