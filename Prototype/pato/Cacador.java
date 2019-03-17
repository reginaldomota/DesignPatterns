package pato;

public class Cacador {

	public static void main(String[] args) {
		
		PatoMarrecoPrototype prototipoPatoMarreco = new PatoMarrecoPrototype();
		
		PatoPrototype patoDoLago = prototipoPatoMarreco.clone();
		patoDoLago.setQuatidadePatinhos(5);
		
		PatoPrototype patoDoRio = prototipoPatoMarreco.clone();
		patoDoRio.setQuatidadePatinhos(3);		
		
		System.out.println(patoDoLago.informacoes());
		System.out.println(patoDoRio.informacoes());
		
		PatoMudoPrototype prototipoPatoMudo = new PatoMudoPrototype();
		
		PatoPrototype patoPequeno = prototipoPatoMudo.clone();
		patoPequeno.setQuatidadePatinhos(7);
		
		System.out.println(patoPequeno.informacoes());

	}

}
