package pizza;

public class PizzariaHighTech {

	public static void main(String[] args) {
		
		Pizza pCalabresa = new Pizza.Builder("Calabresa", "Farinha de Trigo", "Fermento Biológico")
								.recheio("Calabresa")
								.tempero("sal")
								.build();
		System.out.println(pCalabresa);
		
		Pizza pCafe = new Pizza.Builder("Café", "Farinha de Trigo", "Fermento Químico")
				.recheio("Café com bastante cafeína")
				.tempero("sal")				
				.molho("Molho de café")
				.build();
		System.out.println(pCafe);

	}

}
