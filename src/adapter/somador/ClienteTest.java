package adapter.somador;

public class ClienteTest {
	
	public static void main(String[] args) {
		SomadorEsperado somador = new SomadorExistente();
		Cliente cliente = new Cliente(somador);
		cliente.executar();
		
	}
}	
