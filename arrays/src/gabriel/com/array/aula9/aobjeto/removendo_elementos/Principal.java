package gabriel.com.array.aula9.aobjeto.removendo_elementos;

import java.util.Arrays;

public class Principal {
	
	//          REMOVER ELEMENTOS DE UM ARRAY
	public static void main(String[] args) {
		Test test = new Test();
		
		int indiceExclusao = 2;
		
		int[] numerosJogosAtuais = {25, 11, 8, 46, 37, 14, 55};
		int[] novosJogosAtuais = new int[numerosJogosAtuais.length - 1];
		
		test.removerElementos(numerosJogosAtuais, 0);
		
		// se o retorno do método for uma ARRAY eu posso colocar um ÍNDICE nele
		System.out.println("retorno: "+test.removerElementos(numerosJogosAtuais, 0)[5]);
		
		
		// MÉTODO DA CLASSE SYSTEM PARA EXCLUIR VALORES DE ARRAY
		// recebe muitos parâmetros- eu fiz um método acima mais simples
		// tive que usar ele duas vezes para fazer a cópia
		System.arraycopy(numerosJogosAtuais, 0, novosJogosAtuais, 
				0, indiceExclusao);
		System.arraycopy(numerosJogosAtuais, indiceExclusao+1, novosJogosAtuais, 
				indiceExclusao, novosJogosAtuais.length - indiceExclusao);
	
		System.out.println(Arrays.toString(numerosJogosAtuais));
		System.out.println(Arrays.toString(novosJogosAtuais));
	}

}
