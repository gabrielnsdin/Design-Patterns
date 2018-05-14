package strategy.diaSemana;

public class Domingo implements StrategyDiaSemana{

	private String mensagem;
			
	public Domingo(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void mensagemDia() {
		System.out.println(this.mensagem);
	}
}
