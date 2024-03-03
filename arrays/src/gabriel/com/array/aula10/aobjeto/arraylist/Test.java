package gabriel.com.array.aula10.aobjeto.arraylist;

public class Test {
	
	
	public int[] removerElementos(int[] entrada, int posicao) {
		int[] resultado = new int[entrada.length - 1];
		
		for(int i = 0; i < entrada.length; i++) {
			if(i == posicao) {
				continue;
			} else if(i > posicao) {
				resultado[i-1] = entrada[i];
			} else {
				resultado[i] = entrada[i];
			}
		}
		return resultado;
	}
	
	/* EMOÇÃO, MEU PRIMEIRO DESÁFIO QUE EU NÃO CONGUIA FAZER, FIZ AGORA COM UMA CERTAS FACILIDADE
	DANDO CERTO NA PRIMEIRA TENTATIVA*/
	public int fatorial(int valor) {
		int resultado = valor;
		
		for(int i= 1; i < valor; i++) {
			resultado *= (valor-i);
		}
		
		return resultado;
	}
	
	
	
}
