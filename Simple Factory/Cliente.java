package pizza;

public class Cliente {

	public static void main(String[] args) {
		
		PizzariaHighTech pizzaria = new PizzariaHighTech(new PizzaSimpleFactory());

		pizzaria.pedirPizza("Queijo");
	}

}
