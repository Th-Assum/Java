package TrabalhoAV2;

public class Principal {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Anderson", "Rua Oliveira belo 31");
		Cliente cliente2 = new Cliente("Aléxia", "Rua do Sossego 143");
		
		LinhaTelefonica linhaFixa1 = new Fixa(35, "3333-3333", cliente1);
		LinhaTelefonica linhaMovel1 = new Movel(235, "99999-9999", true, cliente1);
		
		cliente1.getLinhaTelefonica().add(linhaFixa1);
		cliente1.getLinhaTelefonica().add(linhaMovel1);
		
		LinhaTelefonica linhaFixa2 = new Fixa(28, "4444-4444", cliente2);
		LinhaTelefonica linhaMovel2 = new Movel(285, "98888-8888", false, cliente2);
		
		cliente2.getLinhaTelefonica().add(linhaFixa2);
		cliente2.getLinhaTelefonica().add(linhaMovel2);
		System.out.println(cliente1);
		System.out.println(cliente2);
	}

}
