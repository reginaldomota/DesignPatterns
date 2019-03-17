package pizza;

import java.util.ArrayList;

public class QueijoCotage extends IngredientesPizza{
	
	public QueijoCotage(){
		
		ArrayList<String> ingQueijo = new ArrayList<String>();
		ingQueijo.add("Farinha de Trigo");
		ingQueijo.add("Ovos");
		ingQueijo.add("Queijo Cotage");
		
		super.setIngredientes(ingQueijo);
		
	}

}
