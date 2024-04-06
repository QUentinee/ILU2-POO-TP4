package scenarioTest;

import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		Etal etalsang = new Etal();
		
		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		
//		IEtal<Produit>[] marche = new IEtal[3];
//		IEtal etalSanglier = new Etal<>();
//		IEtal etalPoisson = new Etal<>();
//		marche[0] = etalSanglier;
//		marche[1] = etalPoisson;
	}
	
}
