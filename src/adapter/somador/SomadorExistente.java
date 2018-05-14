package adapter.somador;

import java.util.List;

public class SomadorExistente implements SomadorEsperado{
	
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}

	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = ListVectorAdapter.transformToList(vetor);
		System.out.println(lista);
		return somaLista(lista);
	}
}