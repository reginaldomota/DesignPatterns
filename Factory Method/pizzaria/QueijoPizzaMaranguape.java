package pizza;

import java.util.ArrayList;

public class QueijoPizzaMaranguape extends Pizza {
	
	public QueijoPizzaMaranguape(){
		
		super.setNome("queijo");
		super.setCaracteristica("massa fina com borda larga");
		super.setTempoPreparo("15");
		super.setTemperatura("230");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("farinha de trigo");
		ingredientes.add("ovos");
		ingredientes.add("queijo");
		
		super.setIngredientes(ingredientes);
		
	}

}
