package gabriel.com.array.aula2;

import java.util.Arrays; // a IDE já importar aumaticamente

//                             ACESSANDO ELEMENTOS DE UM ARRAY

public class Principal {

	public static void main(String[] args) {
		int[] notas = {8, 5, 4, 9, 10};
		
		// para imprimir um array tenho que converter para STRING
		// Arrays.toString( nome do array ); 
		System.out.println(Arrays.toString(notas));
		
		// assim como uma variável eu posso alterar o valor, mas não o tipo e tudo mais.
		notas[0] = 10;
		
		// fazendo soma sem o FOR, uma form BURRA de fazer
		int totalNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
		System.out.println("total de notas: " + totalNotas);
		
		// forma dinâmica de acesso - acessando o índice 3 (posicao -1)
		int posicao = 4;
		System.out.println(notas[posicao - 1]);
	}

}
