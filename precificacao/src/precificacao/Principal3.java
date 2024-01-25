package precificacao;

public class Principal3 {
	public static void main(String[] args) {
		Produto feijao = new Produto();
		Produto.alterarCustoEmbalagem(50);
		feijao.alterarPrecoCusto(100);
		
		double custosProduto = Produto.calcularCustosTotais(feijao);
		
		System.out.printf("Total de Custos: %.2f",custosProduto);
	}
}
