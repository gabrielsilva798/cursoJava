package desafio4OrientavcaoObjeto;

public class Principal {
	public static void main(String[] args) {
		NumeroUltil numeroUtil = new NumeroUltil();
		int maiorNumeroInteiro = numeroUtil.maiorNumeroInteiro(5, 8, 4);
		double maiorNumeroDouble = numeroUtil.maiorNumerodouble(5.8, 5.9, 2.2);
		
		System.out.printf("Maior número Inteiro: %s%n",maiorNumeroInteiro);
		System.out.printf("Maior número Double: %s%n",maiorNumeroDouble);
	}

}
