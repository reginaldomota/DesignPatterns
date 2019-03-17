package pizza;

import java.util.ArrayList;

public class ChocolatePizzaEusebio extends Pizza {
	
	public ChocolatePizzaEusebio(){
		
		super.setNome("Chocolate");
		super.setCaracteristica("massa fina com bordas muito finas");
		super.setTempoPreparo("34");
		super.setTemperatura("400");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("farinha de trigo");
		ingredientes.add("ovos");
		ingredientes.add("chocolate");
		
		super.setIngredientes(ingredientes);
		
	}

}
