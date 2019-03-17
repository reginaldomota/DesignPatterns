package pizza;

public class PizzariaHighTech {

	PizzaSimpleFactory fabrica;
	
	public PizzariaHighTech(PizzaSimpleFactory fabrica){
		this.fabrica = fabrica;
	}

	public Pizza pedirPizza(String tipo){
		Pizza pizza = fabrica.criarPizza(tipo);
		
		if(pizza != null){
			pizza.preparar();
			pizza.assar();
			pizza.cortar();
			pizza.embalar();
		}else{
			System.out.println("Infelizmente ainda não temos esse sabor. =(");
		}
		
		
		return pizza;
	}
}
