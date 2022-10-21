package Ex;

public class Principal {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Thiago", 25, "M");
		p[1] = new Pessoa("Ysabella", 18, "F");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("POO ", "Pedro Paulo ", 500, p[1]);
		l[2] = new Livro("Avancado ", "Maria Candido", 800, p[0]);
		

		l[0].abrir();
		l[0].folhear(300);
		l[0].avancarPag();

		l[0].avancarPag();
		l[0].voltarPag();
		l[0].detalhes();
		
		l[1].abrir();
		l[1].folhear(80);
		l[1].avancarPag();

		l[1].avancarPag();
		l[1].voltarPag();
		l[1].detalhes();
		

		l[2].abrir();
		l[2].folhear(743);
		l[2].avancarPag();

		l[2].avancarPag();
		l[2].voltarPag();
		l[2].detalhes();

	}

}
