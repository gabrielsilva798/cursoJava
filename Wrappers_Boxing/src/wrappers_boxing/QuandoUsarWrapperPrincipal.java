package wrappers_boxing;

public class QuandoUsarWrapperPrincipal {
	public static void main(String[] args) {
		Integer idade = null;
		
		/* ERRO: NullPointException em todas as instruções abaixo.
		*  dar erro porque quando faz o UNBOXING e vira PRIMITIVO, porque os tipos primitivos
		*  não aceitam NULL.
		*/
		System.out.println(idade + 10);
		System.out.println(idade == 100);
		System.out.println(idade.equals(100));
	}
}
