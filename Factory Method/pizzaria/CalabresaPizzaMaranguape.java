package pizza;

import java.util.ArrayList;

public class CalabresaPizzaMaranguape extends Pizza {
	
	public CalabresaPizzaMaranguape(){
		super.setNome("calabresa");
		super.setCaracteristica("massa fina com borda fina");
		super.setTempoPreparo("30");
		super.setTemperatura("300");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("farinha de trigo");
		ingredientes.add("ovos");
		ingredientes.add("calabresa");
		
		super.setIngredientes(ingredientes);
	}

}
