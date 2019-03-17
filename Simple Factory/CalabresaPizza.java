package pizza;

public class CalabresaPizza extends Pizza{

	@Override
	public void preparar() {
		System.out.println("Preparando uma pizza de calabresa");
	}

	@Override
	public void assar() {
		System.out.println("Assando a pizza de calabresa");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando a pizza de calabresa");
	}

	@Override
	public void embalar() {
		System.out.println("Embalando a pizza de calabresa");
	}

}
