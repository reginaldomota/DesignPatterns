package pizza;

import java.util.ArrayList;

public class QueijoPizzaEusebio extends Pizza {
	
	public QueijoPizzaEusebio(){
		super.setNome("Queijo");
		super.setCaracteristica("massa media com bordas muito finas");
		super.setTempoPreparo("45");
		super.setTemperatura("250");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("farinha de trigo");
		ingredientes.add("ovos");
		ingredientes.add("queijo");
		
		super.setIngredientes(ingredientes);
	}

}
