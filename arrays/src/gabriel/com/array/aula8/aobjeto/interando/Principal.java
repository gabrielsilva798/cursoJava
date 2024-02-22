package gabriel.com.array.aula8.aobjeto.interando;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
//		COPIANDO E ESPANDINDO UM ARRAY.
		int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};
		
//		COPIANDO O ARRAY, deve se copiar para outro array.
		/*Arrays.copyOf(numerosJogo1, NUMEROS DE POSIÇÕES A SEREM COPIADAS)
		COMEÇANDO DO 1*/
		int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length);
		
		System.out.println(Arrays.toString(numerosJogo1));
		System.out.println(Arrays.toString(numerosJogo2));
		
//		             		EXPANDINDO O ARRAY		
		/*O COPYOF() TAMBÉM ESPANDI, É SÓ COLOCAR O + COM A QUANTIDADE A SER ADCIONADA,
		  NO CASO ELE PREENCHER COM ZERO EM ARRAYS DO TIPO PRIMITIVO E COM NULL EM ARRAYS DO 
		  TIPO WRAPPER.*/
		int[] numerosJogo3 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);
		
		System.out.println(Arrays.toString(numerosJogo3));
		
		// colocar um valor de forma dinâmica.
		// menos -1, porque o a contagem dos [] começa no ZERO e do LENGTH NO 1
		numerosJogo3[numerosJogo3.length - 1] = 44; 
	}

}
