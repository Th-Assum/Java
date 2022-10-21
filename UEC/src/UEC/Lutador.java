package UEC;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}else if(this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		if(vitorias >= 0) {
			this.vitorias = vitorias;
		}
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		if(derrotas >=0) {
			this.derrotas = derrotas;
		}
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		if(empates >= 0) {
			this.empates = empates;
		}
	}
	
	public void apresentar(){
		System.out.println("_______________________________________________________");
		System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com "+ this.getIdade() + " anos e " + this.getAltura() + "m de altura");
		System.out.println("Pesando "+ this.getPeso() +"Kg");
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
		System.out.println("_______________________________________________________");
	}
	public void status() {
		System.out.println("__________________________________");
		System.out.println(this.getNome());
		System.out.println("é um peso "+ this.getCategoria());
		System.out.println("Ganhou: "+ this.getVitorias());
		System.out.println("Perdeu: "+ this.getDerrotas());
		System.out.println("Empatou: "+ this.getEmpates());
		System.out.println("___________________________________");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	

}


 