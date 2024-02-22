package array;
import java.util.Arrays;

public class ArrayParaString {
	public static void main(String[] args) {
		int[] notas = {8, 5, 4, 9, 10};
		
		//Arrays.toString() transforma um ARRAY em STRING.
		String notasEmString = Arrays.toString(notas);
				
		System.out.println(notasEmString);
	}
}
