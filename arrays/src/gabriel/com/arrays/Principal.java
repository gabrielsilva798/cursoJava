package gabriel.com.arrays;

public class Principal {

	public static void main(String[] args) {
	//  ARRAY declarado, mas não instanciado
		int[] alunos = new int [5];
		
	//  ARRAY inicializado e instanciado --NÃO PRECISA FALAR O NÚMERO DE POSIÇÕES
		int[] notas2 = new int[] {8, 5, 4, 9, 10};
		
	/* ARRAY inicializado e instanciado de forma mais SIMPLES. igual outras linguagens.
	 	ela não funciona se não for na mesma instrução (inicializar e instancia depois)*/
		int[] notas = {8, 5, 4, 9, 10};
		
		alunos[1] = 15;
		
		System.out.println(alunos[29]);

	}

}
