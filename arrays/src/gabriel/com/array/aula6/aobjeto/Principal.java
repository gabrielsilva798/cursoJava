package gabriel.com.array.aula6.aobjeto;

public class Principal {

	public static void main(String[] args) {
		Turma turmaB = new Turma();
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno1.nome = "Dani";
		aluno1.idade = 15;
		
		aluno2.nome = "Gabriel";
		aluno2.idade = 17;
		
		turmaB.nomeProfessora = "Larissa";
		turmaB.identificacao = "Maternal B";
		turmaB.alunos = new Aluno[3];
		
	//	01º MANEIRA DE INSTÂNCIA UM ARRAY DO TIPO ALUNO
		turmaB.alunos[0] = aluno1;
		turmaB.alunos[1] = aluno1;
		
	//	02º MANEIRA DE INSTÂNCIA UM ARRAY DO TIPO ALUNO
		turmaB.alunos[2] = new Aluno();
		turmaB.alunos[2].nome = "Tífane";
		turmaB.alunos[2].idade = 14;
		
	//	System.out.println(turmaB.alunos[1]);
	}

}
