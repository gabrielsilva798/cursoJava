package gabriel.com.array.aula14.multidimensional.interacao;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
String[][] todasCidades = new String[3][];
		
		todasCidades[0] = new String[3];
		todasCidades[0][0] = "Urbelândia";
		todasCidades[0][1] = "Uberada";
		todasCidades[0][2] = "Belo Horizonte";
		
		todasCidades[1] = new String[2];
		todasCidades[1][0] = "Brasília";
		todasCidades[1][1] = "Estrutural";
		
		todasCidades[2] = new String[1];
		todasCidades[2][0] = "Fortaleza";
		
		//make by me
		for (int i = 0; i <todasCidades.length; i++) {
			for(int j = 0; j < todasCidades[i].length; j++) {
				System.out.printf("indices[%d][%d]: %s%n", i, j, todasCidades[i][j]);
			}
		}
		
		System.out.println("------------------------------------------------------------");
		
		for(int i = 0; i < todasCidades.length; i++) {
			System.out.printf("Array do indices[%d] é %s%n",i,
					Arrays.toString(todasCidades[i]));
		}
		
		System.out.println("------------------------------------------------------------%n");
		System.out.println("Usando FOR EACH");
		
		for(String[] listaCidade:todasCidades) {
			for(String cidade:listaCidade) {
				System.out.printf("A cidade é %s%n", cidade);
			}
		}
	}

}
