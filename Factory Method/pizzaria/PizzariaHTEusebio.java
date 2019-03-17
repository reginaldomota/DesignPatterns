package pizza;

public class PizzariaHTEusebio extends PizzariaHighTech {

	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		
		if(tipo.equals("Queijo")){
			pizza = new QueijoPizzaEusebio();
		}
		else if(tipo.equals("Salsicha")){
			pizza = new SalsichaPizzaEusebio();
		}
		else if(tipo.equals("Chocolate")){
			pizza = new ChocolatePizzaEusebio();
		}
		
		return pizza;
	}

}
