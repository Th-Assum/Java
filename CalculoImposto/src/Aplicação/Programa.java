package Aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Fisica;
import Entidade.Juridica;
import Entidade.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList<>();
		
		System.out.print("Vai calcular o impostos de quantas Pessoas ?");
		int qnt = sc.nextInt();
		
		for(int i = 1; i<=qnt; i++) {
			System.out.println("Imposto da " + i +"ª Pessoa: ");
			System.out.print("Pessoa Fisica ou Juridica?(F ou J) ");
			char pessoa = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double renda = sc.nextDouble();
			if(pessoa == 'F' || pessoa == 'f') {
				System.out.print("Gastos com saude: ");
				Double gastos = sc.nextDouble();
				lista.add(new Fisica(nome,renda,gastos));
			}else if(pessoa == 'J' || pessoa == 'j') {
				System.out.print("Quantidade de funcionarios: ");
				int qntFuncionarios = sc.nextInt();
				lista.add(new Juridica(nome,renda,qntFuncionarios));
			}
			
		}
		double soma=0.0;
		for (Pessoa p : lista) {
			soma += p.impostos();
			System.out.println(p.toString());
		}
		System.out.println("TOTAL DE IMPOSTOS ARRECADADO: R$ " + String.format("%.2f", soma));

		sc.close();
	}

}
