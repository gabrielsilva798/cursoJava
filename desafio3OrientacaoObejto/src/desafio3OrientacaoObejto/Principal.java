package desafio3OrientacaoObejto;

public class Principal {

	public static void main(String[] args) {
		CalculoArea calculoArea = new CalculoArea();
		
//		System.out.println(CalculoArea.areaDoQuadrado(2));
		System.out.printf("Area do circulo: %.3f",calculoArea.areaDoCirculo(3));
	}

}
