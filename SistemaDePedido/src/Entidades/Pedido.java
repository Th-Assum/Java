package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enumeração.StatusPedido;

public class Pedido {
	
	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	
	private List<ItemPedido> item = new ArrayList<>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public Pedido() {
		
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.cliente = cliente;
		this.momento = momento;
		this.status = status;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItem() {
		return item;
	}
	public void addItem(ItemPedido item) {
		this.getItem().add(item);
	}
	public void removeItem(ItemPedido item) {
		this.getItem().remove(item);
	}
	
	public double total() {
		double soma=0.0;
		for(ItemPedido item : item) {
			soma += item.subTotal();
		}
		return soma; 
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data Pedido: " + sdf.format(getMomento()) + "\n");
		sb.append("Status: " + status + "\n");
		sb.append("Cliente: " + cliente.toString() + "\n");
		sb.append("Pedido: \n");
		for(ItemPedido item : item) {
			sb.append(item + "\n");
		}
		sb.append("Valor total: $" + String.format("%.2f", total()));
				return sb.toString();
	}	
}
