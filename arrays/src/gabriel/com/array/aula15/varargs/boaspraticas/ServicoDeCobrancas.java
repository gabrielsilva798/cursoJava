package gabriel.com.array.aula15.varargs.boaspraticas;

import java.util.Objects;

//                         COMO OBRIGAR O VARARGS
public class ServicoDeCobrancas {
	void pagar2(Fatura fatura, String... emailsCobranca) {

		// NÃO É UMA BOA PRÁTICA
		/*como o VARARS não é obrigatório eu criei uma excessão para que o usuário coloque pelo
		 * menos 1 email de cobrança.*/	
		if (emailsCobranca.length == 0) {
			throw new IllegalArgumentException("Informe, pelo menos, 1 email de cobrança.");
		}

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

	//                        MANEIRA CERTA
	/*criamos um outro argumento antes do VARARGS do mesmo tipo do VARARGS(array), e  chamamos o
	 * o método que seria usado no VARARGS(array) outra vez para esse novo argumento.*/
	void pagar3(Fatura fatura, String emailCobranca, String... emailsAdcionais) {

		
		//Objects.requireNonNull(), para ovitar que seja passado o valor NULL
		Objects.requireNonNull(fatura, "informe a fatura.");
		Objects.requireNonNull(emailCobranca, "informe a email de cobrança.");
		
		System.out.printf("Fatura %d, no valor total de R$%.2f, foi paga!%n", fatura.numero, 
				fatura.valorTotal);

		enviarNotificacao(fatura, emailCobranca);
		
		for(String email: emailsAdcionais) {
			enviarNotificacao(fatura, email);
		}
	}
	
// criase um método por fora, e chama ele dentro da função duas vezes, uma para o novo argumento
// outra para o VARARGS
	private void enviarNotificacao(Fatura fatura, String email) {
		System.out.printf("Fatura %d enviada para %s%n", fatura.numero, email);
	}
}
