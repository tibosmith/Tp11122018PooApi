package fr.ensim.yaelboutreux.TpNote111217;

import java.util.ArrayList;
import java.util.List;

public class ContratPrevoyance extends Contrat{
	
	
	public List<String> determinerGaranties(){
		List<String> garantie = new ArrayList<String>();
		garantie.add("Accidents de la vie");
		garantie.add("Maladie");
		garantie.add("Mutuelle");
		return garantie;	
	}
	
	public double determinerCotisation(){
		double cotisation = 75.0;
		return cotisation;
	}
	
	public Contrat creationContrat(){
		Contrat monNouveauContrat = new ContratPrevoyance();
		return monNouveauContrat;
	}
	

}
