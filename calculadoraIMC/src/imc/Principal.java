package imc;

public class Principal {

	public static void main(String[] args) {
		CalculadoraIMC calculadoraIMC = new CalculadoraIMC();
		var joao = new Paciente();

		joao.peso = 50;
		
		joao.altura = 1.80;
		
		IndiceMassaCorporal imc = calculadoraIMC.calcular(joao);

		System.out.printf("IMC: %.2f%n", imc.resultado);
		
	}

}
