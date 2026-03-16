package SERVICE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.JDBC;
import MODELE.Medecin;


public class Fonctionnalités_Medecin {
	public void ajouter(Medecin m) {
		JDBC jb = new JDBC();
		jb.connect();
		String req = "INSERT INTO Medecin(idMed,nom,prenom,specialite) VALUES('"+m.getIdMed()+"','"+m.getNom()+"','"+m.getPrenom()+"','"+m.getSpecialite()+"')";
	
	try {
		jb.sta.executeUpdate(req);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

	}
	public void supprimer(int id ) {
		JDBC jb = new JDBC();
		jb.connect();
		String req = "DELETE FROM Medecin where id='"+id+"'";
		
		try {
			jb.sta.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void modifier(Medecin m) {
		JDBC jb = new JDBC();
		jb.connect();
		String req="Update Medecin set nom= '"+m.getIdMed()+"', '"+m.getNom()+"', '"+m.getPrenom()+"', '"+m.getSpecialite()+"'";
		try {
			jb.sta.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet connexion(String log, String password) {
		ResultSet rs = null;
		JDBC jb = new JDBC();
		jb.connect();
		String req = "SELECT  Login,Password FROM Medecin where Login='"+log+"' AND Password='"+password+"'";
		try {
			rs= jb.sta.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
}
	public ResultSet listeMedecin() {
		ResultSet rs = null;
		JDBC jb = new JDBC();
		jb.connect();
		String req="SELECT * FROM Medecin";
		try {
			rs = jb.sta.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
   }	
	public ResultSet rechercher(int id) {
		ResultSet rs = null;
		JDBC jb = new JDBC();
		jb.connect();
		String req="SELECT * FROM Medecin WHERE ID='"+id+"'";
		try {
			rs = jb.sta.executeQuery(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}

	