package wrappers_boxing;

public class ComparandoWrappers {
	public static void main(String[] args) {
		Integer number1 = Integer.valueOf(127);	//mesa coisa do de vaixo.
		Integer number2 = 127; //AUTOBOING - conversão automâtica.
		
	//	System.out.println(number1 == number2);
		
//-----------------------------------------------------------------------------------------------
		Integer number3 = Integer.valueOf(128);	//mesa coisa do de vaixo.
		Integer number4 = 128; //AUTOBOING - conversão automâtica.
		
	//	System.out.println(number3 == number4);
		
		
// COMO COMPARAR VALORES DE OBEJTOS DIFERENTES E SE TEM O MESMO TIPO
		//usamos o .EQUALS(outro objeto)
		// == compara os endereços, se fazem referencia ao mesmo objeto.
		Integer number5 = Integer.valueOf(128);	
		Integer number6 = 128;
		
//		System.out.println(number5.equals(number6));
		
		
// COM TIPOS DIFERENTE O .EQUALS() DA FALSE.
		Integer number7 = 128;	
		Short number8 = 128; 
		
//		System.out.println(number7.equals(number8));
		
// PARA COMPARAR TIPOS DIFERENTE USA-SE CONVESÃO DE VALORES PARA PRIMITIVO.
		Integer number9 = 128;	
		Short number10 = 128; 
		
		System.out.println(number9.intValue() == number10.intValue());
	}

}
