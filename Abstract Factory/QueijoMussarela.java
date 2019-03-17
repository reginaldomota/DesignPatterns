package pizza;

import java.util.ArrayList;

public class QueijoMussarela extends IngredientesPizza{
	
	public QueijoMussarela(){
		
		ArrayList<String> ingQueijo = new ArrayList<String>();
		ingQueijo.add("Farinha de Trigo");
		ingQueijo.add("Ovos");
		ingQueijo.add("Queijo Mussarela");
		
		super.setIngredientes(ingQueijo);
		
	}

}
