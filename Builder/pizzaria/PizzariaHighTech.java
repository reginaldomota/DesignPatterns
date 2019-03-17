package pizza;

public class PizzariaHighTech {

	public static void main(String[] args) {
		
		Pizza pCalabresa = new Pizza.Builder("Calabresa", "Farinha de Trigo", "Fermento Biol�gico")
								.recheio("Calabresa")
								.tempero("sal")
								.build();
		System.out.println(pCalabresa);
		
		Pizza pCafe = new Pizza.Builder("Caf�", "Farinha de Trigo", "Fermento Qu�mico")
				.recheio("Caf� com bastante cafe�na")
				.tempero("sal")				
				.molho("Molho de caf�")
				.build();
		System.out.println(pCafe);

	}

}
