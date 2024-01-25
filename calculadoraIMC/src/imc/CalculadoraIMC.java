package imc;

public class CalculadoraIMC {

	
	IndiceMassaCorporal calcular(Paciente paciente) { 
		IndiceMassaCorporal imc = new IndiceMassaCorporal();
		imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
		imc.peso = paciente.peso;
		imc.altura = paciente.altura;
		
		if (imc.estaComObesidade()) {
			System.out.printf("Paciente com altura de %.2f e peso de %.2f está"
					+ " com obesidade .%n", imc.altura, imc.peso);
		}
		
		if (imc.abaixoDoPesoIdeal()) {
			System.out.printf("Paciente com altura de %.2f e peso de %.2f está"
					+ " abaixo do peso ideal .%n", imc.altura, imc.peso);
		}

		return imc;
	}
}
