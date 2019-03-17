package labirinto;

public class Labirinto {
	
	private static Labirinto labirinto = null;
	
	public static Labirinto getInstance(){
		if(labirinto == null){
			labirinto = new Labirinto();
		}
		return labirinto;
	}
	
	public void criarQuarto(){
		System.out.println("Quarto criado");
	}
	
	public void criarPorta(){
		System.out.println("Porta Criada");
	}
	
	public void criarBomba(){
		System.out.println("Bomba Criada");
	}
}
