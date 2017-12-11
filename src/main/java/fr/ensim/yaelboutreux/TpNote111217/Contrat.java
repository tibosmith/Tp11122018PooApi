package fr.ensim.yaelboutreux.TpNote111217;

import java.util.List;


public abstract class Contrat {
	
	protected String numeroContrat;
	protected boolean contratValide;

	public abstract Contrat creationContrat(); 
	public abstract List<String> determinerGaranties(); 
	public abstract double determinerCotisation();
}
