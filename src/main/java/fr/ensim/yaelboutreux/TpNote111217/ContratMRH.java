package fr.ensim.yaelboutreux.TpNote111217;

import java.util.ArrayList;
import java.util.List;

public class ContratMRH extends Contrat{
	
	public List<String> determinerGaranties(){
		List<String> garantie = new ArrayList<String>();
		garantie.add("Incendies");
		garantie.add("Vitres");
		garantie.add("Inondation");
		garantie.add("Responsabilité Civile");
		return garantie;	
	}
	
	public double determinerCotisation(){
		double cotisation = 100.0;
		return cotisation;
	}
	
	public Contrat creation(){
		Contrat monNouveauContrat = new ContratMRH();
		return monNouveauContrat;
	}

}
