package gabriel.com.array.aula15.varargs;

public class ServicoDeCobrancas {
	//                                VARARGS
	/* É uma função que eu posso trocar os colchetes do array de argumento de um método, por
	 * 3 pontos (...), AASIM OS ARGUMENTOS EXTRAS VIRÃO ELEMENTOS DO ARRAY, E TEM QUE SER DO TIPO
	 * DO ARRAR, AQUI EU SÓ PODEREI PASSAR STRINGS.
	 * 
	 * COM O VARARGS O ARRAY FICA OPCIONAL, EU POSSO OU NÃO PASSAR ELES
	 * 
	 *              O VARARGS PRECISA SER SEMPRE O ÚLTIMO PARÂMETRO.
	 * */
	
	void pagar2(Fatura fatura, String... emailsCobranca) {
		System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n", fatura.numero, 
				fatura.valorTotal);
		
		for(String email: emailsCobranca) {
			 System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
		}
	}
	
	void pagar(Fatura fatura, String[] emailsCobranca) {
		System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n", fatura.numero, 
				fatura.valorTotal);
		
		for(String email: emailsCobranca) {
			 System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
		}
	}
}
