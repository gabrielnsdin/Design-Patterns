package adapter.somador;

import java.util.ArrayList;
import java.util.List;

public class ListVectorAdapter {
	
	public static int[] transformToVector(List<Integer> lista) {
		int[] vetor = new int[lista.size()];
		
		for(int i = 0; i < lista.size(); i++) {
			vetor[i] = (int) lista.get(i);
		}
		
		return vetor;
	}
	
	public static List<Integer> transformToList(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		
		for(int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
			
		}
		
		return lista;
	}
}
