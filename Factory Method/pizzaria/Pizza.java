package pizza;

import java.util.ArrayList;

public abstract class Pizza {
	
	private String nome;	
	private String caracteristica;
	private String tempoPreparo;
	private String temperatura;
	private ArrayList<String> ingredientes;
	
	// preparando a pizza
	public void preparar(){
		System.out.println("Preparando a pizza de " + getNome() + " com " + getCaracteristica());
		for (String ingrediente : getIngredientes()) {
			System.out.println("Adicionando " + ingrediente);
		}
	}
	
	// assando a pizza
	public void assar(){
		System.out.println("Assando a pizza em " + getTempoPreparo() + " minutos a " + getTemperatura() + " graus");
	}
	
	// cortando a pizza	
	public void cortar(){
		System.out.println("Cortando a pizza");
	}
	
	// embalando a pizza
	public void embalar(){
		System.out.println("Embalando a pizza");
	}
	
	
	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

}
