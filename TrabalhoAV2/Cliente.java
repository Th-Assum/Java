package TrabalhoAV2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String endereco;
	private List<LinhaTelefonica> linhaTelefonica = new ArrayList<>();
	
	public Cliente(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<LinhaTelefonica> getLinhaTelefonica() {
		return linhaTelefonica;
	}

	public void setLinhaTelefonica(List<LinhaTelefonica> linhaTelefonica) {
		this.linhaTelefonica = linhaTelefonica;
	}

	@Override
	public String toString() {
		String txt = "Cliente\nNome: " + nome + "\nEndereco: " + endereco + "\n";
		for (LinhaTelefonica tel : linhaTelefonica) {
			txt += tel + "\n";
		}
		return txt;
		
	
	}
	
	

}
