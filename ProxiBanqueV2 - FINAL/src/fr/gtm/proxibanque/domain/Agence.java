package fr.gtm.proxibanque.domain;

import java.util.Date;

public class Agence {

	private String id;
	private String nom;
	private String adresse;
	private Date   datecreation;


	public Agence(String id, String nom, String adresse, Date datecreation) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.datecreation = datecreation;
	}

	public Agence() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", datecreation=" + datecreation + "]";
	}
}
