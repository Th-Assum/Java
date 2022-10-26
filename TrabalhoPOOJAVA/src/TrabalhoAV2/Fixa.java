package TrabalhoAV2;

public class Fixa extends LinhaTelefonica{
	
	public int franquia = 30;
	
	
	public Fixa(int qtdMinutosGastos, String numero, Cliente cliente) {
		super(qtdMinutosGastos, numero, cliente);
	}
	
	public double calcular() {	
		if (this.getQtdMinutosGastos() <= franquia) {
			return 45.00;
		}else {
			int minutosExcedentes = this.getQtdMinutosGastos() - franquia;
			return calcular(minutosExcedentes) + 45.00;
		}
	}
	public double calcular(int minutosExcedentes) { 
		return minutosExcedentes * 0.05;
	}

	@Override
	public String toString() {
		return "Linha Fixa\nNumero: " + this.getNumero() + " - Quantidade de minutos: " + this.getQtdMinutosGastos() + " - Valor a pagar: R$" + calcular();
	}
	
	
}
