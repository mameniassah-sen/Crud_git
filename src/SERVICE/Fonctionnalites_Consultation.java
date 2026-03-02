package SERVICE;

import DAO.JDBC;
import DAO.JDBC;
import DAO.JDBC;
import MODELE.Consultation;
import MODELE.Consultation;

public class Fonctionnalites_Consultation {
	public void ajouter(Consultation c ) {
		JDBC jb = new JDBC();
		jb.connect();
		String req = "INSERT INTO Consultation(idC,Objet,Montant,idP, idMed) VALUES('"+c.getIdCons()+"','"+c.getObjet()+"','"+c.getMontant()+"','"+c.getIdPat()+"','"+c.getIdMed()+"')";
	}
	public void supprimer(int id ) {
		JDBC jb = new JDBC();
		jb.connect();
		String req = "DELETE FROM Consultation where id='"+id+"'";
	}
	public void modifier(Consultation c) {
		JDBC jb = new JDBC();
		jb.connect();
		String req="Update Consultation set nom= '"+c.getIdCons()+"', '"+c.getObjet()+"', '"+c.getMontant()+"', '"+c.getIdPat()+"','"+c.getIdMed()+"'";
	}
	public void listeConsultation() {
		JDBC jb = new JDBC();
		jb.connect();
		String req="SELECT * FROM Consultation";
	}
	public void rechercher(int id) {
		JDBC jb = new JDBC();
		jb.connect();
		String req="SELECT * FROM Consultation WHERE ID='"+id+"'";
	}

}
