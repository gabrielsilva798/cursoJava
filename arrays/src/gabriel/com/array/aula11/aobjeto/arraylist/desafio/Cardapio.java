package gabriel.com.array.aula11.aobjeto.arraylist.desafio;

import java.util.ArrayList;

public class Cardapio {
	ArrayList<Item> itens = new ArrayList<>();
	void adicionarItem(Item item) {
		itens.add(item);
	}
	void removerItem(int indice) {
		itens.remove(indice);
	}
	
	void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
		for (Item item : itens) {
			if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
				item.imprimir();
			}
		}
	}
}
