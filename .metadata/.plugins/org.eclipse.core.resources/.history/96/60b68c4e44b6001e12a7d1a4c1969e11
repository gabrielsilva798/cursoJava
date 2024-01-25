package folhadepagamento;

public class ContratoTrabalho {
	Funcionario funcionario = new Funcionario();
	
	static double ValorHoraTrabalhada;
	static double ValorHoraExtraTrabalhada;
	
	double AdcionalPorFilho() {
		Holerite holerite = new Holerite();
		
		double adcional;
		
		if (funcionario.funcionarioPossuiFilhos()) {
			adcional = (1 + holerite.ValorAdicionalParaFilhos);
		} else {
			adcional = 1;
		}
		
		return adcional;
	}
}