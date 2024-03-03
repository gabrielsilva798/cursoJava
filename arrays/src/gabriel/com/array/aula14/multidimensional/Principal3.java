package gabriel.com.array.aula14.multidimensional;

public class Principal3 {
	
	public static void main(String[] args) {
		//Array irregular.
		String[][] cidades = new String[3][];
		
		cidades[0] = new String[3];
		cidades[0][0] = "Urbelândia";
		cidades[0][1] = "Uberada";
		cidades[0][2] = "Belo Horizonte";
		
		cidades[1] = new String[2];
		cidades[1][0] = "Brasília";
		cidades[1][1] = "Estrutural";
		
		cidades[2] = new String[1];
		cidades[2][0] = "Fortaleza"; 
	}
}
