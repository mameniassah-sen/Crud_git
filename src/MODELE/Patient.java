package MODELE;

public class Patient {
	private int idPat;
	private String prenom ;
	private String nom;
	private String sexe; 
	private int age;
	public int getIdPat() {
		return idPat;
	}
	public void setIdPat(int idPat) {
		this.idPat = idPat;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Patient() {
		super();
	}
	public Patient(int idPat, String prenom, String nom, String sexe, int age) {
		super();
		this.idPat = idPat;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}
	

}
