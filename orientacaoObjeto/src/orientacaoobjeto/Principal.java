package orientacaoobjeto;

public class Principal {	
	
	public static void main (String[] args) {
		Carro meuCarro = new Carro();
		
		meuCarro.anoFabricacao = 2015;
		meuCarro.cor = "preto";
		meuCarro.fabricante = "Honda";
		meuCarro.modelo = "HRV";
		meuCarro.precoCompra = -120000;
		
		
		
/*para usar a clase referendada no meu carro eu preciso estánciar 
* um novo objeto.
* esse obejto faz referência a variável PROPRIETÁRIO do objeto
* instánciado anteriomente MEUCARRO
*/
		

		meuCarro.proprietario = new Pessoa();
		
		meuCarro.proprietario.nome = "Gabriel Bonito";
		meuCarro.proprietario.anoNascimento = 1998;
		meuCarro.proprietario.cpf = "003-234-584-98";
	
		Pessoa voce = new Pessoa();
		
	/* outra meneira e instáncia um objeto VOCE referenciando a classe PESSOA,
	 * e depois fazer  referencia com o objeto seuCarro.
	 * O CARA DO VÍDEO RECOMENDOU ESSE METÓDO.
	 */ 
		voce.nome = "Voçê da Silva";
		voce.anoNascimento = 2005;
		voce.cpf = "111-222-333-98";
		
		
		Carro seuCarro = new Carro();
		seuCarro.anoFabricacao = 2022;
		seuCarro.cor = "Branco";
		seuCarro.fabricante = "BMW";
		seuCarro.modelo = "X6";
		seuCarro.precoCompra = 980000;
		seuCarro.proprietario = voce; //aqui eu faço a referência
		
		              //  MÉTODO
		meuCarro.imprimirResumoDepressiacao();
		//double ipva = meuCarro.calculcarIpva();
		//System.out.println(ipva);
		
		//System.out.println(meuCarro.calculcarIpva());

		
		
		//chamei por variáveis, mas poderia chamar direto tbm
/*		double valoRevendaMeuCarro = meuCarro.calcularValorRevenda();
		int tempoDeUsoEmAnos = meuCarro.calularTempoDeUsoEmAnos();
		
		System.out.printf("Tempo de uso em (anos): %d %n", 
				tempoDeUsoEmAnos);
		System.out.printf("Valor de revenda: %6.2f %n", 
				valoRevendaMeuCarro);
*/
		
	}

}
