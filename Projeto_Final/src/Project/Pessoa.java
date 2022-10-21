package Project;

public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	
	
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void ganharExp(int quantidade) {
		this.setExperiencia(this.getExperiencia() + quantidade);
	}

	@Override
	public String toString() {
		return " Nome: " + nome + "\n Idade:" + idade + "\n Sexo: " + sexo + "\n Experiencia: " + experiencia + "\n";
	}
	
}
