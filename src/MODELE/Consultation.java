package MODELE;

public class Consultation {
	private int idCons;
	private String objet;
	private int montant;
	private int idPat;
	private int idMed;
	public int getIdCons() {
		return idCons;
	}
	public void setIdCons(int idCons) {
		this.idCons = idCons;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public int getIdPat() {
		return idPat;
	}
	public void setIdPat(int idPat) {
		this.idPat = idPat;
	}
	public int getIdMed() {
		return idMed;
	}
	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}
	public Consultation() {
		super();
	}
	public Consultation(int idCons, String objet, int montant, int idPat, int idMed) {
		super();
		this.idCons = idCons;
		this.objet = objet;
		this.montant = montant;
		this.idPat = idPat;
		this.idMed = idMed;
	}
	
	
	
}



