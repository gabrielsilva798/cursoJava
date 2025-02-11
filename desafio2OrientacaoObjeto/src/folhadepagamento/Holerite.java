package folhadepagamento;

public class Holerite {
	Funcionario funcionario = new Funcionario();
	
	static double totalHorasNormais;
	static double totalHorasExtras;
	double ValorAdicionalParaFilhos = 0.10;
	
	static double totalEncargosTrabalhistas() {
		ContratoTrabalho contrato = new ContratoTrabalho();
		
		double resultado = (totalHorasNormais * ContratoTrabalho.ValorHoraTrabalhada) +
				(totalHorasExtras * ContratoTrabalho.ValorHoraExtraTrabalhada);
		
		return resultado * contrato.AdcionalPorFilho();

	}
	
	void imprimirHolerite() {
		
		System.out.printf("Nome Funcionario: %s%nQuantidade de Filho: %d%nTotal Horas "
				+ "trabalhadas: %.2f.%nTotal Horas trabalhadas: %.2f.%nValor de Acrecimo por "
				+ "Filho: %.2f.%n", Funcionario.nome,Funcionario.quantidadeDeFilhos, 
				Holerite.totalHorasNormais,Holerite.totalHorasExtras, ValorAdicionalParaFilhos);
	}
}
