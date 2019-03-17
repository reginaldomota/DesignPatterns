package pizza;

public class PizzaQueijo extends Pizza{
	
	public IFabricaDeIngredientes fabIng;
	
	public PizzaQueijo(IFabricaDeIngredientes fabIng){
		this.setNome("Queijo");
		this.setTempoPreparo("50");
		this.setTemperatura("450");
		this.fabIng = fabIng;
	}

	@Override
	public void preparar(){
		System.out.println("Preparando a pizza de " + getNome() + " com " + fabIng.criarCaracteristicas().getCaracteristica());
		for (String ingrediente : fabIng.criarIngredientes().getIngredientes()) {
			System.out.println("Adicionando " + ingrediente);
		}
	}


}
