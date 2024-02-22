package gabriel.com.array.aula8.aobjeto.interando;

public class Principal2 {
	public static void main(String[] args) {
		Turma turmaB = new Turma();
		turmaB.identificacao = "Martenal B";
		turmaB.nomeProfessora = "Tia Roberta";
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		aluno1.idade = 3;
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Laura";
		aluno2.idade = 15;
		
		turmaB.adcionarAluno(aluno1);
		turmaB.adcionarAluno(aluno2);
		
		turmaB.imprimirListasAlunos();
	}
}
