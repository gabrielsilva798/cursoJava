package gabriel.cim.array.aula3.interandoarray;

import java.util.Arrays;

public class Calculadora {
	
	static double calcularMedia(int[] numeros) {
		int totalNotas = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			totalNotas += numeros[i];
		}
		
		/*            FOR MELHORADO // outra opção, mas não retornar o índice I, sim o valor
		 * 
		 * for (int number: numero) {
		 * 		totalNotas += number;
		 * }*/
	
		return (double) totalNotas / numeros.length;
	}

	
	static String inverterArray(int[] numero) {
		int[] valor = new int[numero.length];
		
		for (int i = (numero.length - 1), j = 0; i >= 0; i--, j++) {
			valor[j] = numero[i];
		}
		
		return Arrays.toString(valor);

	}
}
