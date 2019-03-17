package pizza;

public class PizzariaHighTech {

	public static void main(String[] args) {
		
		Pizza pQueijo = new Pizza("Queijo");
		Pizza pCafe = new Pizza("Café");
		
		CozinhaAdapter adaptador1 = new CozinhaAdapter(pQueijo);
		CozinhaAdapter adaptador2 = new CozinhaAdapter(pCafe);
		
		adaptador1.assarNoFornoCaseiro();		
		adaptador2.assarNoFornoIndustrial();
	}

}
