package desafio3OrientacaoObejto;

public class CalculoArea {
	
	static double areaDoQuadrado(double ladoDoQuadrado) {
		double areaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado;
		
		return areaDoQuadrado;
	}

	double areaDoCirculo(double raio) {
		final double areaDoCirculo; // coloque o FINAL como teste do "DESÁFIO OPP 4".
		double pi = 3.14159265358979323846;
		
		areaDoCirculo = (raio * raio) * pi;
		
		return areaDoCirculo;
	}
}
