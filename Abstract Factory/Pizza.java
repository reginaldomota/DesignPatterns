package pizza;


public abstract class Pizza {
	
	private String nome;	
	public CaracteristicasPizza caracteristica;
	private String tempoPreparo;
	private String temperatura;
	public IngredientesPizza ingredientes;
	
	// preparando a pizza
	abstract public void preparar();
	
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

	

	public String getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	
	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

}
