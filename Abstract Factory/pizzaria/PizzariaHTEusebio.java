package pizza;

public class PizzariaHTEusebio extends PizzariaHighTech {

	@Override
	public Pizza criarPizza(String tipo) {
		
		Pizza pizza = null;
		IFabricaDeIngredientes fabEusebio = new FabricaDeIngredientesEusebio(); 
		
		if(tipo.equals("Queijo")){
			pizza = new PizzaQueijo(fabEusebio);
		}
		
		return pizza;
	}

}
