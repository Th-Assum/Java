package Entidades;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	private Produto produto;

	public ItemPedido() {

	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return this.getPreco() * this.getQuantidade();
	}

	@Override
	public String toString() {
		return produto.toString() + ", Quantidade: " + quantidade + ", Subtotal: $" + String.format("%.2f", subTotal());
	}
	
	
	
}
