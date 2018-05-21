package strategy.sort;

import java.util.Arrays;

public class SortTest {
	
	public static void main(String[] args) {
		
		int [] v1 = {5,3,65,1,8,6,97};
		int [] v2 = {5,3,65,1,8,6,97};
		int [] v3 = {5,3,65,1,8,6,97};
		int [] v4 = {5,3,65,1,8,6,97};

		
		
		Sort sort = new BubbleSort();
		sort.ordena(v1);
		
		sort = new InsertionSort();
		sort.ordena(v2);
		
		sort = new SelectionSort();
		sort.ordena(v3);
		
		sort = new QuickSort();
		sort.ordena(v4);
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		System.out.println(Arrays.toString(v3));
		System.out.println(Arrays.toString(v4));
	}
}
