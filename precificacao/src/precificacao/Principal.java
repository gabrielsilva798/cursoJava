package precificacao;
 
public class Principal {
	public static void main(String[] args) {
		Produto novoProduto = new Produto();
//		novoProduto.precoCusto = 100;
		novoProduto.alterarPrecoCusto(100);
		Produto.custoEmbalagem = 30;
		
		ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
		servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

		System.out.printf("Preço de Custo: %.2f%n", novoProduto.precoCusto);
		System.out.printf("Preço de Venda: %.2f%n", novoProduto.precoVenda);
	}
}
