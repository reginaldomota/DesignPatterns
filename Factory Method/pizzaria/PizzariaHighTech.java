package pizza;

public abstract class PizzariaHighTech {
	
	public Pizza pedirPizza(String tipo){
		Pizza pizza = criarPizza(tipo);
		
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
	
	public abstract Pizza criarPizza(String tipo);

}
