package pizza;

import java.util.ArrayList;

public class CafePizzaMaranguape extends Pizza {
	
	public CafePizzaMaranguape(){
		
		super.setNome("cafe");
		super.setCaracteristica("massa grossa com bordas finas");
		super.setTempoPreparo("30");
		super.setTemperatura("480");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("farinha de trigo");
		ingredientes.add("ovos");
		ingredientes.add("cafe");
		
		super.setIngredientes(ingredientes);
	}

}
