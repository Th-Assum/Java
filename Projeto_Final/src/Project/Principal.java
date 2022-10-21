package Project;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[] = new Video[3];
		
		v[0] = new Video("Teste 01");
		v[1] = new Video("Teste 02");
		v[2] = new Video("Teste 03");
		
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto ("Jubileu", 22, "M", "Juba");
		g[1] = new Gafanhoto ("Creuza", 12, "F", "Creuzita");
		
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(g[0], v[0]);//Jubileu assisti Teste 1
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);//Jubileu assisti Teste 02
		vis[1].avaliar(80.0f);
		System.out.println(vis[1].toString());
		
		vis[2] = new Visualizacao(g[1], v[2]);//Creuza assisti Teste 03
		vis[2].avaliar(10);
		System.out.println(vis[2].toString());
		
	}

}
