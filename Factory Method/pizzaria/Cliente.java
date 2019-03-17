package pizza;

public class Cliente {

	public static void main(String[] args) {
		
		PizzariaHighTech pMaranguape = new PizzariaHTMaranguape();
		pMaranguape.pedirPizza("Queijo");
		
		PizzariaHighTech pEusebio = new PizzariaHTEusebio();
		pEusebio.pedirPizza("Salsicha");

	}

}
