package pato;

public class PatoMudoPrototype extends PatoPrototype{

	protected PatoMudoPrototype(PatoMudoPrototype patoMudoPrototype) {
		this.quatidadePatinhos = patoMudoPrototype.getQuatidadePatinhos();
	}
	
	public PatoMudoPrototype() {
		this.quatidadePatinhos = 0;
	}

	@Override
	public String informacoes() {
		return "� o pato-selvagem do Brasil, domesticado pelos ind�genas da Am�rica do Sul."
				+ "\nN�o existem ra�as realmente definidas, mas existe uma linhagem comercial branca,"
				+ "\ndesenvolvida na Fran�a, com r�pido crescimento, usada na produ��o de carne."
				+ "\nEsse pato possui " + getQuatidadePatinhos() + " patinhos";
	}

	@Override
	public PatoPrototype clone() {
		return new PatoMudoPrototype(this);
	}

}
