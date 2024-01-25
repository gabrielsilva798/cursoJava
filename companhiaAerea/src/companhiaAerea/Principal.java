package companhiaAerea;

public class Principal {
	public static void main(String[] args) {
		Aeronave aviagol = new Aeronave();
		aviagol.totalAssentos = 100;
		aviagol.asentosReservados = 30;
		
		aviagol.desativar();
		aviagol.ativar();
		aviagol.reservarAssentos(10);
		
		System.out.printf("GOL (%s): %d assentos disponíveis.%n",
				aviagol.ativo? "Ativo" : "Inativo",
				aviagol.calcularAssentosDisponiveis());
		
		
		
		
		Aeronave aviaoLatam = new Aeronave();
		aviaoLatam.totalAssentos = 120;
		aviaoLatam.asentosReservados = 50;
		
		aviaoLatam.reservarAssentos(20);
		
		System.out.printf("GOL (%s): %d assentos disponíveis.%n",
				aviaoLatam.ativo? "Ativo" : "Inativo",
				aviaoLatam.calcularAssentosDisponiveis());
	}
}
