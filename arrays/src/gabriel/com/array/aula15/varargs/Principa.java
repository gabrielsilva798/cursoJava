package gabriel.com.array.aula15.varargs;

public class Principa {

	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		fatura.numero = 123;
		fatura.valorTotal = 1_293.55;
		String[] emailscobranca = {"joão@gmail.com", "lara@gmail.com"};
		
		ServicoDeCobrancas servicoDeCobranca = new ServicoDeCobrancas();
		
		servicoDeCobranca.pagar(fatura, emailscobranca);
		
	// posso criar um array dentro do argumento de um método que recebe array.	
		servicoDeCobranca.pagar(fatura, new  String[] {"joão@gmail.com", "lara@gmail.com"});
		
	/*	eu posso passar um ARRAY VÁZIO para não notificar ninguém, no caso não usar o array que
		a funçao pede, eu tbm posso fazer uma sobrecarga de método que não precisa recebe um segundo 
		argumento array*/
		servicoDeCobranca.pagar(fatura, new  String[0]);
	// também posso passa um colchetes vázios, fuciona igual o de cima	
		servicoDeCobranca.pagar(fatura, new  String[]{});
		
		//                         VARARGS
		/*no VARARGS não precisa instânciar array, todos os argumentos a mais vira elementos 
		 *do array
		 *EU TAMBÉM POSSO NÃO PASSAR NADA NO ARGUMENTO ARRAY
		 *
		 *                      O VARARGS PRECISA SER SEMPRE O ÚLTIMO PARÂMETRO.
		 */
		
		servicoDeCobranca.pagar2(fatura, "lorena@gmail.com", "laura@gmail.com");
		servicoDeCobranca.pagar2(fatura);
	}

}
