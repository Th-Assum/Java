package Emprego;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.print("Nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel(JUNIOR,MID,SENIOR): ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioTrabalhador = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioTrabalhador, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos ?");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.println("Contrato " + (i+1));
			System.out.print("Digite a data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			int horas = sc.nextInt();
			HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);		
			}
		System.out.println();
		System.out.print("Entre com mes e ano: ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 1));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento " + trabalhador.getDepartamento().getName());
		System.out.println("Renda "+ mesAno + ": " + String.format("%.2f",trabalhador.renda(ano, mes)));
		
		sc.close();
	}

}
