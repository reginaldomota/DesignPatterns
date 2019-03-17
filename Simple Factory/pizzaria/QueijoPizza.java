package pizza;

public class QueijoPizza extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando uma pizza de queijo");
	}

	@Override
	public void assar() {
		System.out.println("Assando a pizza de queijo");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando a pizza de queijo");
	}

	@Override
	public void embalar() {
		System.out.println("Embalando a pizza de queijo");
	}

}
