package Entidade;

public class Juridica extends Pessoa {
	
	private int quantidadeFuncionario;

	public Juridica(String nome, Double rendaAnual, int idFuncionario) {
		super(nome, rendaAnual);
		this.quantidadeFuncionario = idFuncionario;
	}

	public int getIdFuncionario() {
		return quantidadeFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.quantidadeFuncionario = idFuncionario;
	}
	
	public Double impostos() {
		double imposto;
		if(quantidadeFuncionario > 10) {
			imposto = getRendaAnual() * 0.14;	
		}else {
			imposto = getRendaAnual() * 0.16;	
		}
		return imposto;
	}
	public String toString() {
		return "Pessoa juridica: " + getNome() + " - Valor dos impostos: R$ " + String.format("%.2f", impostos());
	}
}
