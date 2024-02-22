package array;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenarArray {

	public static void main(String[] args) {
		int[] notas = {8, 5, 4, 10, 9};
		Integer[] notas2 = {8, 5, 4, 10, 9};
		
		//Arrays.sort() ORDENA OS NUMEROS NA ORDEM CRESCENTE POR PADRÃO.
		//Arrays.sort(notas);
		
		//Arrays.sort(valor, Comparator.reverseOrder()) ORDENA OS NUMEROS NA ORDEM DECRESCENTE
		//só aceita array do tipo CLASSE, por isso coloquei notas2 como WRAPPER.
		Arrays.sort(notas2, Comparator.reverseOrder());
		
		System.out.println(Arrays.toString(notas));

	}

}
