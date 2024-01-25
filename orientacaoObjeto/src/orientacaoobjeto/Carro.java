package orientacaoobjeto;

public class Carro {

	String fabricante;
	String modelo;
	String cor;
	int anoFabricacao ;//valor primitivo não tem valor NULL como padrão, mas 0.
	double precoCompra;
	Pessoa proprietario = new Pessoa(); //relacao entre classes: COMPOSIÇÃO.
	
	
	
	boolean desligado; //valor padrão do BOOLEAN é FALSE.
	
	
	
	void imprimirResumoDepressiacao() {
		double valoRevendaMeuCarro = calcularValorRevenda();
		int tempoDeUsoEmAnos = calularTempoDeUsoEmAnos();
		
		if (precoCompra <= 0) {
			System.out.println("Valor de revenda igual a 0.");
			return; //eu posso colocar um RETURN; no void, mas sem nada retornando
		} 
			System.out.printf("Tempo de uso em (anos): %d %n", 
					tempoDeUsoEmAnos);
			System.out.printf("Valor de revenda: %6.2f %n", 
					valoRevendaMeuCarro);
		
	}
	
	
	double calculcarIpva() {
		double valorIpva;
		
		if (calularTempoDeUsoEmAnos() >= 10) {
			double tempoDeUsoEmAnos = calcularValorRevenda();
			
			valorIpva = tempoDeUsoEmAnos * 0.04;
			
			System.out.printf("O IPVA do carro é %.2f%n",valorIpva);
			
			return valorIpva;
		} else {
			System.out.println("Isento de IPVA.");
			return 0;
		}
		
	}
	
	
	int calularTempoDeUsoEmAnos() {
		return 2024 - anoFabricacao;
	}
	
	
	double calcularValorRevenda() { //  MÉTODO
		int VidaUtilEmAnos = 20;
		
		double valorRevenda = (precoCompra / VidaUtilEmAnos) * 
				(VidaUtilEmAnos - calularTempoDeUsoEmAnos());
		
		if (valorRevenda < 0) {
			return 0;
		}
		
		return valorRevenda;
	}
}
