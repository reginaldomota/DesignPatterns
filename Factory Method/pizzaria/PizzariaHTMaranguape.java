package pizza;

public class PizzariaHTMaranguape extends PizzariaHighTech{

	@Override
	public Pizza criarPizza(String tipo) {
		
		Pizza pizza = null;
		
		if(tipo.equals("Queijo")){
			pizza = new QueijoPizzaMaranguape();
		}
		else if(tipo.equals("Calabresa")){
			pizza = new CalabresaPizzaMaranguape();
		}
		else if(tipo.equals("Caf�")){
			pizza = new CafePizzaMaranguape();
		}
		
		return pizza;
	}

}
