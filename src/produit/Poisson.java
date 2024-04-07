package produit;

public class Poisson extends Produit{
	String jour;

	public Poisson(String jour) {
		super("poisson", "gramme");
		this.jour = jour;
	}

	@Override
	public String description() {
		return nom + " pêchés " + jour;
	}

	@Override
	public int calculerPrix(int prix) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
