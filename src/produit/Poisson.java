package produit;

public class Poisson extends Produit{
	String jour;
	int date;

	public Poisson(int date, String jour) {
		super("poisson", "gramme");
		this.jour = jour;
		this.date = date;
	}

	@Override
	public String description() {
		return nom + " pêchés " + jour;
	}
	
}
