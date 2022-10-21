package UEC;
import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	Random random = new Random();
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if((l1.getCategoria().equals(l2.getCategoria())) && l1 != l2){
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}else {
			this.setAprovada(false);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		}
	}
	public void lutar() {
		if(this.isAprovada()) {
			System.out.println("------DESAFIADO------");
			this.getDesafiado().apresentar();
			System.out.println("------DESAFIANTE-----");
			this.getDesafiante().apresentar();
			int vencedor = random.nextInt(3);
			System.out.println("========RESULTADO==========");
			
			switch(vencedor) {
			
			case 0:
				System.out.println("Empatou!");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1:
				System.out.println("Vitoria do " + this.getDesafiado().getNome());
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();	
				break;
			case 2:
				System.out.println("Vitoria do " + this.getDesafiante().getNome());
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			}
			System.out.println("============================");
			
			
		}else {
			System.out.println("========================");
			System.out.println("Luta entre " + this.getDesafiado().getNome() + " e " + this.getDesafiante().getNome()+ " não pode acontecer");
			System.out.println("========================");
		}
		
	}
}
