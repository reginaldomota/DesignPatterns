package labirinto;

public class Cliente {

	public static void main(String[] args) {
		
		Labirinto lab = Labirinto.getInstance();
		
		lab.criarPorta();
		lab.criarQuarto();
		lab.criarBomba();
		
		System.out.println("Esses objetos foram criados do labirinto: " + lab.toString());
		
		Labirinto lab2 = Labirinto.getInstance();
		
		lab2.criarPorta();
		lab2.criarQuarto();
		lab2.criarBomba();
		
		System.out.println("Esses objetos foram criados do labirinto: " + lab2.toString());
		
	}

}
