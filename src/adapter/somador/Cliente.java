package adapter.somador;

public class Cliente {
	private SomadorEsperado somador;

	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}

	public void executar() {
		SomadorExistente somadorExistente = new SomadorExistente();
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int soma = somadorExistente.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}

