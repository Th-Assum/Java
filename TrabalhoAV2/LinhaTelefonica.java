package TrabalhoAV2;

public abstract class LinhaTelefonica implements Consumo {
	
	private int qtdMinutosGastos;
	private String numero;
	private Cliente cliente;

	public LinhaTelefonica(int qtdMinutosGastos, String numero, Cliente cliente) {
		super();
		this.qtdMinutosGastos = qtdMinutosGastos;
		this.numero = numero;
		this.cliente = cliente;
		
		
	}
	
	public int getQtdMinutosGastos() {
		return qtdMinutosGastos;
	}
	public void setQtdMinutosGastos(int qtdMinutosGastos) {
		this.qtdMinutosGastos = qtdMinutosGastos;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public abstract double calcular();

	
}

