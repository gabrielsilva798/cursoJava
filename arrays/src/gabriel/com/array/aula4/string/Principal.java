package gabriel.com.array.aula4.string;
import java.util.Arrays;
//TRANSFORMAR ARRAY EM STRING, PARA IMPRIMIR NA TELA

public class Principal {

	public static void main(String[] args) {
		int[] notas = {8, 5, 4, 9, 10};
		
		String notasEmString = Arrays.toString(notas);
		
		System.out.println(notasEmString);

	}

}
