package gabriel.com.array.aula13.aobjeto.vazios;

import java.util.ArrayList;

public class Cardapio {
	ArrayList<ItemCardapio> itens = new ArrayList<>();

	void adicionarItem(ItemCardapio item) {itens.add(item);}

	void removerItem(int indice) {itens.remove(indice); }

	void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
		for (ItemCardapio item : itens) {
			if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
				item.imprimir();
			}
		}
	}
	
	ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {
		ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();
		
		for(ItemCardapio item: itens) {
			if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
				itensEncontrados.add(item);
			}
		}
		// BOA PRATICA
		return itensEncontrados;
		// má prática
		// return itensEncontrados.isEmpty() ? null : itensEncontrados;
	}
}
