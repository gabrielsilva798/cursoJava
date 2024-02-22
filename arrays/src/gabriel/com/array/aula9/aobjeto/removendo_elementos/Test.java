package gabriel.com.array.aula9.aobjeto.removendo_elementos;

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
}
