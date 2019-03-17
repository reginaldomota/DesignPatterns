package pizza;

public class Pizza {

	public String nome;
	
	public Pizza(String nome){
		this.nome = nome;
	}
	
	// assando a pizza
	public void assar(){
		System.out.println("Assando a pizza de " + this.nome);
	}
	
}
