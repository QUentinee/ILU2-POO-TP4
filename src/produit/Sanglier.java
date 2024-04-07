package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	int poids;
	Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", "kilogramme");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	public String description() {
		return nom + " de " + poids + unite + " chassé par " + chasseur.getNom();
	}

	@Override
	public int calculerPrix(int prix) {
		// TODO Auto-generated method stub
		return 0;
	}

}