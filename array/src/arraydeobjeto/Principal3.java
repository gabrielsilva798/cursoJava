package arraydeobjeto;

import java.util.Arrays;

//                       COMO REMOVER ÍTENS DE UM ARRAY.
public class Principal3 {

	public static void main(String[] args) {
		/* ARRAYs são IMUTÁVEIS na quantidade de valores, então eu preciso fazer uma cópia sem
		o/os elementos que eu não quero.*/
		int[] numerosJogosAtual = {25, 11, 8, 46, 37, 14, 55};
		
		// vou criar um novo array com 1 elemento a menos que o anterior.
		int[] numerosNovoJogo = new int[numerosJogosAtual.length -1]; //deixei Dinâmico
		
		//System.arraycopy() para copiar um arrya em outro já existente
		/*System.arraycopy(array de origem, posição de inicio, array de destino, 
		 * posição de inicio da copia, quantidades de elementos a serem copiados)
		 */
		
		//PRECISA FAZER DUAS VEZES, ACHO QUE O FOR É MAIS INTERESSANTE NESSE CASO.
		System.arraycopy(numerosJogosAtual, 0, numerosNovoJogo, 0, 2);
		System.arraycopy(numerosJogosAtual, 3, numerosNovoJogo, 2, 4);
		
		System.out.println(Arrays.toString(numerosJogosAtual));
		// todos os valores são OBVIAMENTE vazios.
		System.out.println(Arrays.toString(numerosNovoJogo));
	}

}
