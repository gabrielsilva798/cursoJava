package imc;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double valor1;
	double valor2;
	
	System.out.printf("Qual o Primeiro Valor? ");
	valor1 = entrada.nextDouble();
	
	System.out.println("Qual o Segundo Valor? ");
	valor2 = entrada.nextDouble();
	
	double resultado = valor1 * valor2;
	
	System.out.printf("A multiplicação dos 2 valores é %.2f", resultado, ".");
	
	entrada.close();
	}
}
