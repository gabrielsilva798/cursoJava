package gabriel.com.array.aula13.aobjeto.vazios;

public class ItemCardapio {
	String descricao;
	double preco;


	public boolean possuiPrecoEntre(double precoMinimo, double precoMaximo) {
		return preco >= precoMinimo && preco <= precoMaximo;
	}

	void imprimir() {System.out.printf("%s x R$%.2f%n", descricao, preco);}
}
