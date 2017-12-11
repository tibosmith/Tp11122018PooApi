package fr.ensim.yaelboutreux.TpNote111217;

import java.util.Date;
import java.util.List;

public class Personne {
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private List<Contrat> listeContrat;
	
	
	/*public boolean estClient(){
	return null;	
	}*/
	
	
	public String obtenirNomComplet(){
		String NomComplet = (this.nom + " " + this.prenom); 
		return NomComplet;
	}
	
	public Date obtenirDateDeNaissance(){
	return this.dateDeNaissance;
	}
	
	
	/*public Contrat creerContrat(){
		Contrat monNouveauContrat = new Contrat();
		return monNouveauContrat;
	}*/
	
	public void resilierContrat(Contrat contratAResilier){
		contratAResilier.contratValide = false;
	}
	
	public void resilierContrat(String uneStringIci){
		//TODO
	}
	
	public List<Contrat> obtenirContratsAuto(){
	return null;
	}
	
	public List<Contrat> obtenirContratsMRH(){
	return null;
	}
	
	public String toString(){
	return null;
	}
	
	
	

}
