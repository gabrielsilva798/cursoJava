package precificacao;

public class Principal2 {
	public static void main(String[] args) {
//		Produto produto1 = new Produto();
//		Produto produto2 = new Produto();
		
		Produto.alterarCustoEmbalagem(50);
/*		Produto.custoEmbalagem = 20; //acessa a variável da clase
		produto1.custoEmbalagem = 10;
		produto2.custoEmbalagem = 15;
*/		
		Produto.imprimirCustoEmbalagem();
	}
}
