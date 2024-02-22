package wrappers_boxing;

public class QuandoUsarWrappers {
	//           COMO COMPARAR WRAPPERs
	public static void main(String[] args) {
		Integer number1 = 128;
		Integer number2 = 128;
		
		// ERRADO
		System.out.println(number1 == number2);
		
		// CERTO
		System.out.println(number1.equals(number2));
		
		// CERTO
		System.out.println(number1.compareTo(number2) == 0);
		//maneira nova, se retonar 0 são iguais, se retornar 1, são diferentes
	}
}
