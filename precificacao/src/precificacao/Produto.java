package precificacao;

public class Produto {

	static double custoEmbalagem;
	
	double precoCusto;
	double precoVenda;
	
	static double calcularCustosTotais(Produto produto) {
		return Produto.custoEmbalagem + produto.precoCusto;
	}
	
	void alterarPrecoCusto(double precoCusto) {this.precoCusto = precoCusto;}
	
	static void alterarCustoEmbalagem(double custoEmbalagem) {
		Produto.custoEmbalagem = custoEmbalagem;
	}
	
	static void imprimirCustoEmbalagem() {
		System.out.printf("O Custo com Embalagem: %s", Produto.custoEmbalagem,".");
	}
	
}
