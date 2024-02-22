package arraydeobjeto;

public class Principal {

	public static void main(String[] args) {
		Turma turmaB = new Turma();
		turmaB.identificacao = "Martenal B";
		turmaB.nomeProfessora = "Tia mary";
		turmaB.alunos = new Aluno[3]; //a variável ALUNOS da Classe Turma, faz referencia
									 //ao objeto array de Aluno[], com 3 posições.
		
		//para colocar dados no array e preciso instancia o obejto referente. ALUNOS.
		turmaB.alunos[0] = new Aluno();
		turmaB.alunos[0].nome = "Gabriel";
		turmaB.alunos[0].idade = 3;
		
//--------------------------------OUTRA FORMA DE FAZER------------------------------------------
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Laura";
		aluno1.idade = 4;
		
		//não precisa instância de novo, LAURA e GABRIEL fazem referencia ao mesmo objeto
		turmaB.alunos[1] = aluno1;
	
		
//---------------------INTERANDO UM ARRAY - USANDO UM MÉTODO DA CLASSE TURMA--------------------
		turmaB.imprimirListaDeAlunos();
	}
}
