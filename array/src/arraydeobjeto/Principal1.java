package arraydeobjeto;

import java.util.Arrays;

public class Principal1 {               /// COMO COPIAR ARRAY / COMO EXPANDIR UM ARRAY

	public static void main(String[] args) {
		int[] numerosJogos1 = {25, 11, 8, 46, 37, 14};
		
		// para copiar o array usa-se o Arrays.copyof(arg 1, arg 2)
		// 1º arguemento é o array a ser copiado
		// 2º arguemento é o número de iténs do array que serão copiador, começando do começo
		int[] numerosJogos2 = Arrays.copyOf(numerosJogos1, 3);
		
		// copiei os 3 primeiros elementos do !º array
		System.out.println(Arrays.toString(numerosJogos1));
		System.out.println(Arrays.toString(numerosJogos2));
		
		/* ARRAY NÃO TEM TAMANHO DINÂMICO, MAS PODEMOS FAZER UMA CÓPIA COM MAIS ESPÇAO DELE EM
		OUTRA VARIÁVEL*/
		
		// com o Arrays.copyOf() eu também consigo aumentar a capacidade do array
		// basta colocar mais 1 argumento, + depois o numero q eu quero de capacidade a +
		// numerosJogos3 terá 1 espaço a mais que o numerosJogos3.
		int[] numerosJogos3 = Arrays.copyOf(numerosJogos1, numerosJogos1.length + 1);
		
		System.out.println(numerosJogos3.length);
		System.out.println(numerosJogos1.length);
		
		//por padrão os novos espaços vem preenchidos com ZERO
		System.out.println(Arrays.toString(numerosJogos3));
		
		// PREENCHENDO ESSA ÚLTIMA POSIÇÃO DE FORMA DINÂMICA
		numerosJogos3[numerosJogos3.length + 1] = 44;
	}

}
