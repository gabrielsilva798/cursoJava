package gabriel.com.array.aula7.aobjeto.copiar_espandir;

import java.util.Arrays;

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
		turmaB.alunos[1] = aluno2;
		
	//	02º MANEIRA DE INSTÂNCIA UM ARRAY DO TIPO ALUNO
		turmaB.alunos[2] = new Aluno();
		turmaB.alunos[2].nome = "Tífane";
		turmaB.alunos[2].idade = 14;
		
	//	INTERANDO/PERCORRENDO ARRAY     criei um método para fazer isso também.
		for(int i = 0; i < turmaB.alunos.length; i++) {
			Aluno aluno = turmaB.alunos[i];//CRIA UMA VARIÁVEL LOCALPARA DIMINUIR O TAMANHO DO
										//CODIGO
			
			System.out.printf("%d - %s (%d anos)%n", i, aluno.nome, 
					aluno.idade);  //NÃO precisa do I já que o aluno tem ele dentro.
			}
		
		
		// FOR EACH, mas ele não pega o índice, o I.
		for(Aluno aluno: turmaB.alunos) {
			if(aluno != null) { //IF PARA PULAR VALORES NULOS, E NÃO DAR ERRO
				System.out.printf("%s (%d anos)%n", aluno.nome, 
						aluno.idade);
			}
		}
		
		//turmaB.dadosAlunos();
		
	}

}
