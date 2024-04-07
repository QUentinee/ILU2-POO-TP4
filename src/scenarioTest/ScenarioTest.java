package scenarioTest;

import personnages.Gaulois;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;


public class ScenarioTest{
	public static void main(String[] args) {
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};

		Etal<Sanglier> etalsang1 = new Etal<>();
		Etal<Sanglier> etalsang2 = new Etal<>();
		Etal<Poisson> etalpois = new Etal<>();
		
		etalsang1.installerVendeur(obelix, sangliersObelix, 8);
		etalsang2.installerVendeur(asterix, sangliersAsterix, 10);
		etalpois.installerVendeur(ordralfabetix, poissons, 7);
		
		
//		Etal etalsang = new Etal();
		
//		Etal[] marche = new Etal[3];
//		Etal<Sanglier> etalSanglier = new Etal<>();
//		Etal<Poisson> etalPoisson = new Etal<>();
//		marche[0] = etalSanglier;
//		marche[1] = etalPoisson;
//		marche[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10);
		
//		IEtal<Produit>[] marche1 = new IEtal[3];
//		IEtal etalSanglier1 = new Etal<>();
//		IEtal etalPoisson = new Etal<>();
//		marche1[0] = etalSanglier1;
//		marche1[1] = etalPoisson;
	}
	
}
