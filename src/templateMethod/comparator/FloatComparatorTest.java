package templateMethod.comparator;

import java.util.Arrays;

public class FloatComparatorTest {
	
	public static void main(String[] args) {
		Double[] vetor = new Double[5];
		vetor[0] = 1.1;
		vetor[1] = 2.4;
		vetor[2] = 3.3;
		vetor[3] = 4.8;
		vetor[4] = 5.5;
		Arrays.sort(vetor, new FloatComparator());
		System.out.println(Arrays.toString(vetor));
	}
}
