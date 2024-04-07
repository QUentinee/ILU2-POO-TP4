package produit;

public abstract class Produit implements IProduit {
	String nom;
	String unite;
	
	public Produit(String nom, String unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String description();
}
