package pato;

public abstract class PatoPrototype {	

	protected int quatidadePatinhos;
	
	public abstract String informacoes();
	public abstract PatoPrototype clone();
	
	public int getQuatidadePatinhos() {
		return quatidadePatinhos;
	}

	public void setQuatidadePatinhos(int quatidadePatinhos) {
		this.quatidadePatinhos = quatidadePatinhos;
	}

}
