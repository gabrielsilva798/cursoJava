package wrappers_boxing;

public class Principal2 {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.idade = Integer.valueOf("23");
		
		System.out.printf("Idade: %d%n", cliente.idade);
	}
}
