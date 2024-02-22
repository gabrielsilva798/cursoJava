package wrappers_boxing;

public class MetodosDeConvecao {

	public static void main(String[] args) {
		int idade = 20;
		short idadeShort = (short) idade;
		
		// CAST não funcionar em wrappers
		//Short diasEntregaShort = diasEntrega;
		
		Integer diasEntrega = Integer.valueOf(30);
		
		// para converte um WRAPPER para PRIMITIVO eu uso o .TIPOVALUE().
		int diasEntregaInt = diasEntrega.intValue();
		
		//AUTOBOXING
		//a parti do java 5 eu não tenho mais necessidade de colocar o .VALUEOF()
		//Posso colocar o tipo primitivo direto sem converter para WRAPPERS
		Integer diasEntrega2 = 30;
		
		//UNBOXING
		//a parti do java 5 eu não tenho mais necessidade de colocar o .TIPOVALUE()
		//Posso colocar o tipo WRAPPERS direto sem converter para PRIMITIVO. 
		int diasEntregaInt2 = diasEntrega2;

		//Atribuíndo um tipo WRAPPER a um tipo PRIMITIVO.
		short diasEntregaShort = diasEntrega.shortValue();	
		
		//para extair para um wrapper tem o ponto, nome do tipo e Value()
		//lembrando que .VALUEOF( ) é onde vc passa o valor dos WRAPPERs.
		Short diasEntregaClaseShort = Short.valueOf(diasEntrega.shortValue());	
	
		Long diasEntregaLong = Long.valueOf(diasEntrega.longValue());
		
		// algumas conveções podem perder precisão, como INTEGER para FLOAT/DECIMAL. igual o CAST
		Double valorTotal = Double.valueOf(1500.2);
		int valorTotalInt = valorTotal.intValue();
		
		System.out.println(valorTotalInt);

	}
}
