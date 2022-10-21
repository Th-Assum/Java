package Ex;

public class Livro implements Publicacao {
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = leitor;
		this.pagAtual = 0;
		this.aberto = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public void detalhes() {
		System.out.println("Nome do Leitor: " + leitor.getNome());
		System.out.println("Livro: " + this.getTitulo() + " com " + this.getTotPaginas() + " paginas.");
		if (isAberto()) {
			System.out.println("O livro está aberto na pagina "+ this.getPagAtual());
		}else {
			System.out.println("O livro está fechado.");
		}
	}
	public void abrir() {
		this.setAberto(true);
	}
	public void  fechar() {
		this.setAberto(false);
	}
	public void folhear(int pagina) {
		if(pagina <= this.getTotPaginas()) {	
		this.setPagAtual(pagina);
		}
	}
	public void avancarPag() {
		if(this.getPagAtual() < this.getTotPaginas()) {
		this.setPagAtual(this.getPagAtual() + 1);
		}
	}
	public void voltarPag() {
		if(this.getPagAtual() > 0) {
		this.setPagAtual(this.getPagAtual() - 1);
		}
	}
}
	
