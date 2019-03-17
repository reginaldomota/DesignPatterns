package pizza;

public class CozinhaAdapter implements ICozinhaCaseira, ICozinhaIndustrial{

	private Pizza pizza; //adaptado

	public CozinhaAdapter(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void assarNoFornoCaseiro() {
		ICozinhaCaseira cozinha = new CozinhaCaseira();
		cozinha.assarNoFornoCaseiro();
		pizza.assar();
	}

	@Override
	public void assarNoFornoIndustrial() {
		ICozinhaIndustrial cozinha = new CozinhaIndustrial();
		cozinha.assarNoFornoIndustrial();
		pizza.assar();
	}

	
	

}
