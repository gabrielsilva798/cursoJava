package gabriel.com.array.aula15.varargs.boaspraticas;

public class Principa {

	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		fatura.numero = 123;
		fatura.valorTotal = 1_293.55;
		String[] emailscobranca = {"joão@gmail.com", "lara@gmail.com"};
		
		ServicoDeCobrancas servicoDeCobranca = new ServicoDeCobrancas();

		servicoDeCobranca.pagar2(fatura, "lorena@gmail.com", "laura@gmail.com");
		servicoDeCobranca.pagar2(fatura);
		
		
		servicoDeCobranca.pagar3(fatura);
	}

}
