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
		return "É o pato-selvagem do Brasil, domesticado pelos indígenas da América do Sul."
				+ "\nNão existem raças realmente definidas, mas existe uma linhagem comercial branca,"
				+ "\ndesenvolvida na França, com rápido crescimento, usada na produção de carne."
				+ "\nEsse pato possui " + getQuatidadePatinhos() + " patinhos";
	}

	@Override
	public PatoPrototype clone() {
		return new PatoMudoPrototype(this);
	}

}
