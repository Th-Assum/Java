package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;
import Entidade.ProdutoImportado;
import Entidade.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List <Produto> lista = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidade = sc.nextInt();
	
		for(int i=1;i<=quantidade;i++) {
			System.out.println("Produto #" + i);
			System.out.print("Comum, Usado ou Importado ?(C/U/I) ");
			char x = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");			
			Double preco = sc.nextDouble();
			if (x == 'C' || x == 'c') {
				lista.add(new Produto(nome, preco));
			}else if(x == 'I' || x == 'i') {
				System.out.print("Taxa Alfândega: ");
				double tx = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, tx));
			}else if(x == 'U' || x == 'u') {
				System.out.println("Data de fabricação (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());
				lista.add(new ProdutoUsado(nome,preco,data));
			}
				
		}
		System.out.println();
		System.out.println("Etiquetas de Preços: ");
		for(Produto prod : lista) {
			System.out.println(prod.etiquetaPreco());	
		}
		
		
		
		sc.close();
	}
}
	
