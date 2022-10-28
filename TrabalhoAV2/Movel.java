package TrabalhoAV2;

public class Movel extends LinhaTelefonica{
	
	private boolean planoDadosHabilitado;

	public Movel(int qtdMinutosGastos, String numero, boolean planoDadosHabilitado, Cliente cliente) {
		super(qtdMinutosGastos, numero, cliente);
		this.planoDadosHabilitado = planoDadosHabilitado;
	}

	public boolean isPlanoDadosHabilitado() {
		return planoDadosHabilitado;
	}

	public void setPlanoDadosHabilitado(boolean planoDadosHabilitado) {
		this.planoDadosHabilitado = planoDadosHabilitado;
	}
	public double calcular() {
		if(isPlanoDadosHabilitado() == true) {
			return getQtdMinutosGastos() * 0.20 + 40.0;
		}else {
			return getQtdMinutosGastos() * 0.20;
		}
	}
	public String toString() {
		String txt = "Linha Movél\nNumero: " + this.getNumero() + " - Quantidade de minutos: " + this.getQtdMinutosGastos() + " Plano de dados habilitado ? ";
		if(isPlanoDadosHabilitado() == true){
			txt += "Sim - Valor a pagar: R$" + calcular();
		}else {
			txt += "Não - Valor a pagar: R$" + calcular();
		}
		return txt;
				
	}
	
	
	
}
