package MODELE;

public class Medecin {
	private int idMed;
	private String prenom ;
	private String nom;
	private String sexe; 
	private String specialite;
	public int getIdMed() {
		return idMed;
	}
	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Medecin() {
		super();
	}
	public Medecin(int idMed, String prenom, String nom, String sexe, String specialite) {
		super();
		this.idMed = idMed;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.specialite = specialite;
	}
	

}
