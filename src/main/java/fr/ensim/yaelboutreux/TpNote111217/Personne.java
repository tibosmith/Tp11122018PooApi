package fr.ensim.yaelboutreux.TpNote111217;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Personne {
	private boolean estUnClient;
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private List<Contrat> listeContrat = new ArrayList<Contrat>();
	private List<Personne> famille = new ArrayList<Personne>();
	
	public List<Contrat> getListeContrat() {
		return listeContrat;
	}
	public void setListeContrat(List<Contrat> listeContrat) {
		this.listeContrat = listeContrat;
	}
	public List<Personne> getFamille() {
		return famille;
	}
	public void setFamille(List<Personne> famille) {
		this.famille = famille;
	}

	
	
	public boolean isEstUnClient() {
		return estUnClient;
	}
	public void setEstUnClient(boolean estUnClient) {
		this.estUnClient = estUnClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	public boolean estClient(){
		int nombreContrats = this.obtenirContratsAuto().size() + this.obtenirContratsMRH().size() + this.obtenirContratsPrevoyance().size();
		if(nombreContrats > 0) {
			this.setEstUnClient(true);
		}
		else {
			this.setEstUnClient(false);
		}
		return this.isEstUnClient();
	}
	
	
	
	public String obtenirNomComplet(){
		String NomComplet = (this.nom + " " + this.prenom); 
		return NomComplet;
	}
	
	public Date obtenirDateDeNaissance(){
		return this.dateDeNaissance;
	}
	
	
	public Contrat creerContrat(int choix){
		if(choix == 0) {
			Contrat monNouveauContrat = new ContratAuto();
			this.listeContrat.add(monNouveauContrat);
			return monNouveauContrat;	
		}
		else {
			if(choix == 1) {
				Contrat monNouveauContrat = new ContratMRH();
				this.listeContrat.add(monNouveauContrat);
				return monNouveauContrat;	
			}
			else {
				Contrat monNouveauContrat = new ContratPrevoyance();
				this.listeContrat.add(monNouveauContrat);
				return monNouveauContrat;	
			}	
		}	
	}
	
	public void resilierContrat(Contrat contratAResilier){
		contratAResilier.contratValide = false;
	}
	
	public void resilierContrat(String numeroContrat){
		for(Contrat contrat : this.obtenirContratsAuto()) {
			if(numeroContrat.equals(contrat.numeroContrat)){
				contrat.contratValide = false;
			}
		}
		for(Contrat contrat : this.obtenirContratsMRH()) {
			if(numeroContrat.equals(contrat.numeroContrat)){
				contrat.contratValide = false;
			}
		}
		for(Contrat contrat : this.obtenirContratsPrevoyance()) {
			if(numeroContrat.equals(contrat.numeroContrat)){
				contrat.contratValide = false;
			}
		}
	}
	
	public List<Contrat> obtenirContratsAuto(){
		List<Contrat> listeContratAuto = new ArrayList<Contrat>();
		for(Contrat thisContrat : listeContrat) {
			if(thisContrat instanceof ContratAuto) {
				if(thisContrat.contratValide == true) {
					listeContratAuto.add(thisContrat);
				}	
			}			
		}	
		return listeContratAuto;
	}
	
	public List<Contrat> obtenirContratsMRH(){
		List<Contrat> listeContratMRH = new ArrayList<Contrat>();
		for(Contrat thisContrat : listeContrat) {
			if(thisContrat instanceof ContratMRH) {
				if(thisContrat.contratValide == true) {
					listeContratMRH.add(thisContrat);
				}	
			}			
		}	
		return listeContratMRH;
	}
	
	public List<Contrat> obtenirContratsPrevoyance(){
		List<Contrat> listeContratPrevoyance = new ArrayList<Contrat>();
		for(Contrat thisContrat : listeContrat) {
			if(thisContrat instanceof ContratPrevoyance) {
				if(thisContrat.contratValide == true) {
					listeContratPrevoyance.add(thisContrat);
				}	
			}			
		}	
		return listeContratPrevoyance;
	}
	
	public String toString(){
		int nombreContrats = this.obtenirContratsAuto().size() + this.obtenirContratsMRH().size() + this.obtenirContratsPrevoyance().size();
		String message = this.obtenirNomComplet() + ", Client : " + this.estClient() + ", nombre de contrat(s) : " + nombreContrats;
		return message;
	}
	
	
	

}
