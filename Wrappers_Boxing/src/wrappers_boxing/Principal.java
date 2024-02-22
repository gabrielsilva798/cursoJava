package wrappers_boxing;

public class Principal {
	public static void main(String[] args) {
		// tipos primitivos
		// Sem o .VALUEOF() ele passar um tipo primitivo como parâmetro e não um wrapper
		
		Integer diasParaEntrega = Integer.valueOf(3);
		Long codigoEntrega = Long.valueOf(214143254361235252L);
		Float valorFrete = Float.valueOf(23.54F);
		Double valorTotal = Double.valueOf(03.456);
		Character tipoCliente = Character.valueOf('G');
		Boolean compraPaga = Boolean.valueOf(true);
		
		// String é uma clase
		String nomeCliente = String.valueOf("Gabriel");
	}
}
