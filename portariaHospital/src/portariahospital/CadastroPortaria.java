package portariahospital;

public class CadastroPortaria {
	static final int TEMPO_EXPIRACAO_PADRAO_EM_MESSES = 3;
	
	//sobrecarga de método é ter 2 metódos com mesmo nome, mas parÂmetros diferentes,
	void cadastrar(final Visitante visitante) {
		
		//THIS é opcional.
		this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESSES); 
		//chamei o próprio método, LOOP INFINITO
		// SE eu não colocasse o segundo argumento seria um loop infinito
	}
	
	void cadastrar(final Visitante visitante, int tempoExpiracaoEmMesses) {
		final var tempoExpiracaoEmDias = tempoExpiracaoEmMesses * 30;
		
		System.out.printf("Visitante %s cadastrado para %d dias.", visitante.nome,
				tempoExpiracaoEmDias);
	}
	
}
