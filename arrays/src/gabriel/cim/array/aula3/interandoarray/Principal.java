package gabriel.cim.array.aula3.interandoarray;

public class Principal {

	public static void main(String[] args) {
		int[] notas = {8, 5, 4, 9, 10};
		
		double media = Calculadora.calcularMedia(notas);
		String arrayInvertido = Calculadora.inverterArray(notas);

		System.out.printf("a média é %s ; o aluno está %s%n", media, 
				media >= 7 ? "APROVADOR" : "REPROVADO");
		
		System.out.printf("Array invertido: %s%n", arrayInvertido);

	}

}
