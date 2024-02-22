package array;
import java.util.Scanner;

public class AcessandoElementosArrays {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] notas = {8, 5, 4, 9, 10};
		
//					ALTERÁ VALORES DE UM ALEMENTO ESPECÍFICO DO ARRAY.
		notas[3] = 6; 
		System.out.println(notas[3]);
		
//		System.out.println(notas[0]);
		
		//variável para posição
//		int posicao = entrada.nextInt();
		
		//posição - 1
//		System.out.println(notas[posicao - 1]);
		
		int somaNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
//		System.out.println(somaNotas);
		
		entrada.close();
	}

}
