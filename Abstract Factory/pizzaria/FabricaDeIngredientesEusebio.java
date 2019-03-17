package pizza;

public class FabricaDeIngredientesEusebio implements IFabricaDeIngredientes{

	@Override
	public CaracteristicasPizza criarCaracteristicas() {		
		return new MassaFina();
	}

	@Override
	public IngredientesPizza criarIngredientes() {		
		return new QueijoCotage();
	}
	
	

}
