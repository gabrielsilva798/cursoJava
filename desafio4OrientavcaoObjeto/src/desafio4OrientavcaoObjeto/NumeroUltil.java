package desafio4OrientavcaoObjeto;

public class NumeroUltil {
	int maiorNumeroInteiro(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	int maiorNumeroInteiro(int num1, int num2, int num3) {
		if ((num1 > num2 || num1 == 2) && (num1 > num3 || num1 == num3)) {
			return num1;
		} else if ((num2 > num1 || num2 == num1) && (num2 > num3 || num2 == num3)){
			return num2;
		} else {
			return num3;}
	}

//-------------------------------------------------------------------------------------------------	
	double maiorNumerodouble(double num1, double num2) {
		return num1 > num2 ? num1 : num2;
	}

	double maiorNumerodouble(double num1, double num2, double num3) {
		if ((num1 > num2 || num1 == 2) && (num1 > num3 || num1 == num3)) {
			return num1;
		} else if ((num2 > num1 || num2 == num1) && (num2 > num3 || num2 == num3)){
			return num2;
		} else {
			return num3;
		}

	}
}
