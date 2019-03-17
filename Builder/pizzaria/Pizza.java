package pizza;

public class Pizza {
	
	private final String nome;
	private final String tipoMassa;
	private final String tipoFermento;
	private final String recheio;
	private final String tempero;
	private final String molho;
	
	public static class Builder {
		
		private final String nome;
		private final String tipoMassa;
		private final String tipoFermento;
		
		private String recheio;
		private String tempero;
		private String molho;
		
		public Builder(String nome, String tipoMassa, String tipoFermento) {
			this.nome 			= nome;
			this.tipoMassa 		= tipoMassa;
			this.tipoFermento 	= tipoFermento;
		}
		
		public Builder recheio(String recheio){
			this.recheio = recheio;
			return this;
		}
		
		public Builder tempero(String tempero){
			this.tempero = tempero;
			return this;
		}
		
		public Builder molho(String molho){
			this.molho = molho;
			return this;
		}
		
		public Pizza build(){
			return new Pizza(this);
		}
	}
	
	public Pizza(Builder builder){
		this.nome 			= builder.nome;
		this.tipoMassa 		= builder.tipoMassa;
		this.tipoFermento 	= builder.tipoFermento;
		this.recheio 		= builder.recheio;
		this.tempero		= builder.tempero;
		this.molho 			= builder.molho;
	}
	
	public String toString(){
		String pizza = 	"Pizza de " + this.nome + 
						"\nAdicionando " + this.tipoMassa + 
						"\nAdicionando " + this.tipoFermento;
		if(this.recheio != null){ pizza = pizza + "\nAdicionando " + this.recheio; }
		if(this.tempero != null){ pizza = pizza + "\nAdicionando " + this.tempero; }
		if(this.molho != null){   pizza = pizza + "\nAdicionando " + this.molho; }
		
		return pizza;
	}
	

}
