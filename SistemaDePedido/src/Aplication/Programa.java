package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItemPedido;
import Entidades.Pedido;
import Entidades.Produto;
import Enumeração.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome=sc.nextLine();
		System.out.print("E-mail: ");
		String email=sc.nextLine();
		System.out.print("Data de nascimento(DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataNascimento);
		
		System.out.println("Entre com dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		System.out.print("Quantos itens no pedido? ");
		int n = sc.nextInt();
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Dados do "+ (i+1) + "º item:");
			System.out.print("Nome produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidadeProduto = sc.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(quantidadeProduto, precoProduto, produto);	
			
			pedido.addItem(itemPedido);
		}
		
		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);
		
		
		sc.close();
	}

}
