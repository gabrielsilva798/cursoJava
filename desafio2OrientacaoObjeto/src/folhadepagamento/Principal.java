package folhadepagamento;

public class Principal {
	public static void main(String[] args) {
		FolhaPagamento pagamento = new FolhaPagamento();
		Funcionario funcionario = new Funcionario();
		Holerite holerite = new Holerite();
		
		Funcionario.nome = "joão";
		Funcionario.quantidadeDeFilhos = 0;
		Holerite.totalHorasNormais = 10;
		Holerite.totalHorasExtras = 5;
		ContratoTrabalho.ValorHoraTrabalhada = 2;
		ContratoTrabalho.ValorHoraExtraTrabalhada = 3;
		funcionario.adcionarFilhos(3);

		//		System.out.println(contrato.AdcionalPorFilho());
		holerite.imprimirHolerite();
		System.out.printf("Salário do Funcionário: %s%n",pagamento.calcularSalario());
	}
}
