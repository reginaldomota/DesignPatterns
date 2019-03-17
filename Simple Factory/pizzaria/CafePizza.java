package pizza;

public class CafePizza extends Pizza{
	
	@Override
	public void preparar() {
		System.out.println("Preparando uma pizza de caf�. Com bastante cafe�na!");
	}

	@Override
	public void assar() {
		System.out.println("Assando a pizza de caf�.");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando a pizza de caf�.");
	}

	@Override
	public void embalar() {
		System.out.println("Embalando a pizza de caf�");
	}


}
