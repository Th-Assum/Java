package Entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date dataDeFabricacao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	public String etiquetaPreco() {
		return getNome() 
				+ "(Usado) R$ " 
				+  String.format("%.2f", getPreco()) 
				+ "(Data fabricação " 
				+ sdf.format(dataDeFabricacao)
				+ ")" ;
		}
	
	
}
