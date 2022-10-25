package Emprego;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
	
	private String name;
	private NivelTrabalhador nivel;
	private Double basaSalario;
	
	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
	}

	public Trabalhador(String name, NivelTrabalhador nivelTrabalhador, Double basaSalario, Departamento nomeDepartamento) {
		this.name = name;
		this.nivel = nivelTrabalhador;
		this.basaSalario = basaSalario;
		this.departamento = nomeDepartamento;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getBasaSalario() {
		return basaSalario;
	}

	public void setBasaSalario(Double basaSalario) {
		this.basaSalario = basaSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}
	
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
		
	}
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = this.basaSalario;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) {
			int c_ano = cal.get(Calendar.YEAR); 
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (mes == c_mes && ano == c_ano) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
	
}
