package desafio1OrientacaoObjeto;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro();
		Scanner entrada = new Scanner(System.in);
		
		cachorro1.nome = "Baba";
		cachorro1.idade = 4;
		cachorro1.raca = "Dalmata";
		cachorro1.sexo = 'F';
		
		cachorro2.nome = "Caramelo";
		cachorro2.idade = 15;
		cachorro2.raca = "Vira-Lata";
		cachorro2.sexo = 'H';
		
		System.out.println("Qual o número do Cachoro você quer ver os dados?");
		int cachorro = entrada.nextInt();
		
		if (cachorro == 1) {
			System.out.printf("CACHORRO 1.%n%nNome: %s%nIdade: %d%nRaça: %s%nSexo: %s%n"
					,cachorro1.nome,cachorro1.idade,
					cachorro1.raca, cachorro1.sexo == 'H' ? "Macho" : "Fêmea");
		} else if (cachorro == 2) {
			System.out.printf("CACHORRO 2.%n%nNome: %s%nIdade: %d%nRaça: %s%nSexo: %s%n",
					cachorro2.nome,cachorro2.idade,
					cachorro2.raca, cachorro2.sexo == 'H' ? "Macho" : "Fêmea");
		} else {
			System.out.println("VALOR INVALIDO, NÚMERO INEXISTENTE.");
		}
		
		entrada.close();
	}
}
