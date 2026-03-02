package SERVICE;

import DAO.JDBC;
import DAO.JDBC;
import DAO.JDBC;
import DAO.JDBC;
import MODELE.Medecin;
import MODELE.Patient;
import MODELE.Patient;

public class Fonctionnalités_Patient {
	public void ajouter(Patient p ) {
		JDBC jb = new JDBC();
		jb.connect();
		String req = "INSERT INTO Patient(idP,nom,prenom,sexe,age) VALUES('"+p.getIdPat()+"','"+p.getNom()+"','"+p.getPrenom()+"','"+p.getSexe()+"','"+p.getAge()+"')";
	}
	public void supprimer(int id ) {
		JDBC jb = new JDBC();
		jb.connect();
		String req = "DELETE FROM Patient where id='"+id+"'";
	}
	public void modifier(Patient p) {
		JDBC jb = new JDBC();
		jb.connect();
		String req="Update Patient set nom= '"+p.getNom()+"', '"+p.getPrenom()+"', '"+p.getSexe()+"', '"+p.getAge()+"'";
	}
	public void listePatient() {
		JDBC jb = new JDBC();
		jb.connect();
		String req="SELECT * FROM Personne";
	}
	public void rechercher(int id) {
		JDBC jb = new JDBC();
		jb.connect();
		String req="SELECT * FROM Patient WHERE ID='"+id+"'";
	}


}
