package folhadepagamento;

public class Funcionario {
	static String nome;
	static int quantidadeDeFilhos;
	
	int adcionarFilhos(int numeroDeFilhos) {
		return Funcionario.quantidadeDeFilhos += numeroDeFilhos;
	}
	
	boolean funcionarioPossuiFilhos() {
		
		boolean possuiFilhos;
		if (Funcionario.quantidadeDeFilhos != 0) {
			possuiFilhos = true;
		} else {
			possuiFilhos = false;
		}
		
		return possuiFilhos;
	}
}