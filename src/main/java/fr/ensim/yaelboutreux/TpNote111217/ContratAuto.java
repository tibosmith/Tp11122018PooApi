package fr.ensim.yaelboutreux.TpNote111217;

import java.util.ArrayList;
import java.util.List;

public class ContratAuto extends Contrat{

	public List<String> determinerGaranties(){
		List<String> garantie = new ArrayList<String>();
		garantie.add("Accidents");
		garantie.add("Bris de Glace");
		garantie.add("Responsabilité Civile");
		return garantie;	
	}
	
	public double determinerCotisation(){
		double cotisation = 150.0;
		return cotisation;
	}
	
	public Contrat creationContrat(){
		Contrat monNouveauContrat = new ContratAuto();
		return monNouveauContrat;
	}
}
