package pato;

public class PatoMarrecoPrototype extends PatoPrototype{

	protected PatoMarrecoPrototype(PatoMarrecoPrototype patoMarrecoPrototype) {
		this.quatidadePatinhos = patoMarrecoPrototype.getQuatidadePatinhos();
	}
	
	public PatoMarrecoPrototype() {
		this.quatidadePatinhos = 0;
	}

	@Override
	public String informacoes() {
		return 	"É descendente do pato-real e foi domesticado na China."
				+ "\nAs principais raças são o Pequim, Rouen e Corredor Indiano, mas existem muitas outras." +
				"\nEsse pato possui " + getQuatidadePatinhos() + " patinhos";
	}

	@Override
	public PatoPrototype clone() {
		return new PatoMarrecoPrototype(this);
	}

}
