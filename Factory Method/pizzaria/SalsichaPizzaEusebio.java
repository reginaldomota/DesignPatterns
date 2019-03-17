package pizza;

import java.util.ArrayList;

public class SalsichaPizzaEusebio extends Pizza {
	
	public SalsichaPizzaEusebio(){
		
		super.setNome("Salsicha");
		super.setCaracteristica("massa grossa com bordas quadradas");
		super.setTempoPreparo("48");
		super.setTemperatura("257");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.add("farinha de trigo");
		ingredientes.add("ovos");
		ingredientes.add("salsicha de gato listrado que passeia sobre os muros");
		
		super.setIngredientes(ingredientes);
		
	}

}
