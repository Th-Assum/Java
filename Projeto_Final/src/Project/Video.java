package Project;

public class Video implements AcoesVideo {
	
	private String titulo;
	private int avalicao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avalicao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAvalicao() {
		return avalicao;
	}
	public void setAvalicao(int avalicao) {
		int nova;
		nova = (int)((this.avalicao + this.avalicao)/this.views);
		this.avalicao = avalicao;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	public void play() {
		this.setReproduzindo(true);
	}
	public void pause() {
		this.setReproduzindo(false);
	}
	public void like() {
		this.setCurtidas(this.getCurtidas()+1);
	}

	@Override
	public String toString() {
		return  titulo + "\n Avalicao: " + avalicao + "\n Views: " + views + "\n Curtidas: " + curtidas
				+ "\n Reproduzindo: " + reproduzindo + "\n";
	}
	
	
	

}
