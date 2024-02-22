package array;

//                      A Função .LENGTH conta a quantidade de itens em um array.
public class Calculadora {
	
	static double calcularMedia(int[] numeros) {
		int total = 0;
		
		// SOMA DE TODOS OS ELEMENTOS
		for (int numero : numeros) {
			total += numero;
		}
		
/*		for (int i = 0; i < numeros.length; i++) {
*			total += numeros[i];
*       }
*/		
		return (double) total/numeros.length; 

	}
}
