package gabriel.com.array.aula5.ordenando;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
	public static void main(String[] args) {
		int[] notas = {8, 5, 4, 9, 10};
		int[]notas2 = Arrays.copyOf(notas, notas.length);
		Integer[] notas3 = {8, 5, 4, 9, 10};
		
		/*Arrays.sort() CONSEGUE ALTERÁ O VALOR DO ARRAY, SE NÃO QUISER ISSO, FAÇA UMA CÓPIA E
		 *ALTERE ELA, COMO EU FIZ.
		 *ele mesmo imprimi sem o SYSOUT, é método VOID, sem retorno*/
		Arrays.sort(notas2); 
		System.out.println("notas" + Arrays.toString(notas));
		System.out.println("notas" + Arrays.toString(notas2));
		
		/*        COMO FAZER A ORDEM INVERSA, DECRESCENTE
		Comparator.reverseOrder() NÃO FUNCIONA COM TIPOS PRIMITIVOS*/
		Arrays.sort(notas3, Comparator.reverseOrder());
		System.out.println(Arrays.toString(notas3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	      TENTEI FAZER UM SORTE EM O MÉTODO
	 * for(int i = 0; i <= (notas.length - 1); i++) {
			int valor = 0;
			for(int j = 0; j <= (notas.length - 1); j++) {
				if (j != 0 && notas[j-1] > valor) {
	                valor = notas[j];
	            } else if(notas[j] > valor) {
	            	valor = notas[j];
	            }
			notas2[i] = valor;
			}
		} */
	}	
}
