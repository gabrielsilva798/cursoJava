package portariahospital;

public class Principal {
	public static void main(String[] args) {
		var novoVisitante = new Visitante();
		
		novoVisitante.nome = "joão";
		novoVisitante.idade = 12;

		int messesVisitantes = 30;
		
		var cadastroPortaria =  new CadastroPortaria();
		//cadastroPortaria.cadastrar(novoVisitante, messesVisitantes);
		cadastroPortaria.cadastrar(novoVisitante);// sobrecarga, metodo com mesmo nome
			//POSSO TER MÉTODOS COM MESMO NOME, MAS TEM QUE POSSUI PARÂMETROS DIFERENTES.
			//MESMO COM NOME DE PARÂMETROS DIFERENTES, PQ ELE OLHA O TIPO.
		System.out.printf("%nacesso: %s%n",novoVisitante.possuiAcessoRestritoPorIdade() == true 
				? "Liberado." : "Negado.");
		
	}
}
