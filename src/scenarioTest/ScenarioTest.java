package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegauloisold.Etal;
import villagegauloisold.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
//		Etal etalsang = new Etal();
		
		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		marche[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10);
		
//		IEtal<Produit>[] marche1 = new IEtal[3];
//		IEtal etalSanglier1 = new Etal<>();
//		IEtal etalPoisson = new Etal<>();
//		marche1[0] = etalSanglier1;
//		marche1[1] = etalPoisson;
	}
	
}
