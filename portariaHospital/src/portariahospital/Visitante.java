package portariahospital;

public class Visitante {
	static final byte IDADE_MINIMA_ACESSO_IRRESTRITO = 18;
	
	String nome;
	int idade;
	
	boolean possuiAcessoRestritoPorIdade() {
		return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
	}
}
