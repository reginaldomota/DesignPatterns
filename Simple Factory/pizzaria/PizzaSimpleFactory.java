package pizza;

public class PizzaSimpleFactory {
	
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		
		if(tipo.equals("Queijo")){
			pizza = new QueijoPizza();
		}
		else if(tipo.equals("Calabresa")){
			pizza = new CalabresaPizza();
		}
		else if(tipo.equals("Caf�")){
			pizza = new CafePizza();
		}
		
		return pizza;
	}

}
