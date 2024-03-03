package gabriel.com.array.aula11.aobjeto.arraylist.desafio;

public class Item {
	String descricao;
	double preco;

	boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
		return preco >= precoMinimo && preco <= precoMaximo;
	}

	void imprimir() {
		System.out.printf("%s x R$%.2f%n", descricao, preco);
	}

}
