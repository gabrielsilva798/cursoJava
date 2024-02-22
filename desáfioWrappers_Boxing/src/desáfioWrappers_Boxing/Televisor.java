package desáfioWrappers_Boxing;

public class Televisor {
	Integer canal = 130;
	Integer volume = 20;

	void mudarCanal(Integer novoCanal) {
		if (canal.equals(novoCanal)) {
			System.out.println("Novo canal é também o canal atual.");
		} else {
			canal = novoCanal;
			System.out.printf("Canal alterado para %d%n", canal);
		}
	}
	
	void mudarVolume(Integer novoVolume) {
		if (volume.equals(novoVolume)) {
			System.out.println("Novo volume é também o volume atual.");
		} else {
			volume = Integer.valueOf(novoVolume.intValue());
			System.out.printf("Volume alterado para %d%n", volume);
		}
	}
}

