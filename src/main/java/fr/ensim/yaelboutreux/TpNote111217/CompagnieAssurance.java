package fr.ensim.yaelboutreux.TpNote111217;

import java.util.ArrayList;
import java.util.List;

//Done

public class CompagnieAssurance{
	private String nom;
	private List<Personne> listeClientProspect = new ArrayList<Personne>();
	
	public int obtenirNombreDeClients(){
		int nombreClient = 0;
		for(Personne thisClient : listeClientProspect) {
			int nombreDeContrats = thisClient.obtenirContratsAuto().size() + thisClient.obtenirContratsMRH().size() + thisClient.obtenirContratsPrevoyance().size();
			if(nombreDeContrats > 0) {
				nombreClient++;
			}			
		}
		return nombreClient;
	}
	 
	 
	 public int obtenirNombreDeProspects(){
		int nombreProspect = 0;
		for(Personne thisClient : listeClientProspect) {
			int nombreDeContrats = thisClient.obtenirContratsAuto().size() + thisClient.obtenirContratsMRH().size() + thisClient.obtenirContratsPrevoyance().size();
			if(nombreDeContrats == 0) {
				nombreProspect++;
			}			
		}
		return nombreProspect;
	 
	 }
	 
	 public int obtenirNombreDeContrats(){
		int nombreContrats = 0;
		for(Personne thisClient : listeClientProspect) {
			nombreContrats += thisClient.obtenirContratsAuto().size() + thisClient.obtenirContratsMRH().size() + thisClient.obtenirContratsPrevoyance().size();	
		}
		return nombreContrats;
	 }
	 

}
