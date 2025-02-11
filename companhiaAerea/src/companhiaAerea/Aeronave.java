package companhiaAerea;

public class Aeronave {
	
	boolean ativo = true;
	int totalAssentos;
	int asentosReservados;
	
	int calcularAssentosDisponiveis() {
		return totalAssentos - asentosReservados;
	}
	
	
	void reservarAssentos(int numeroAssentos) {
		if(ativo) {
			asentosReservados += numeroAssentos;
		} else {
			System.out.println("Aeronave Desativada. Assentos não reservados.");
		}
	}
	
	
	void desativar() {
		ativo = false;
	}

	
	void ativar() {
		ativo = true;
	}
}
