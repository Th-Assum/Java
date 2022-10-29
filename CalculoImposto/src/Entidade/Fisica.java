package Entidade;

public class Fisica extends Pessoa {

	private Double gastosSaude;

	
	public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	public Double impostos() {
		Double imposto;
		if(getRendaAnual() < 20000.0) {
			imposto = getRendaAnual() * 0.15;	
		}else {
			imposto = getRendaAnual() * 0.25;
		}
		if(gastosSaude > 0) {
			imposto -= gastosSaude * 0.50; 
		}
		return imposto;
	}

	@Override
	public String toString() {
		return "Pessoa fisica: " + getNome() + " - Valor dos impostos: R$ " + String.format("%.2f", impostos());
	}
	
	
}
