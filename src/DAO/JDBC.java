package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {
	String url="jdbc:mysql://localhost/Crud_git";
	String driver="com.mysql.cj.jdbc.Driver";
	String user="root";
	String password="";
	public Connection co=null;
	public Statement sta=null;
	   
	
	public void connect() {
		//gérer les erreurs(ou exception)
		try {
		//1ère étape: chargement de Driver avec la méthode forname
		Class.forName(driver);
		
		//2ème étape: connexion à la base de donnée
		co=DriverManager.getConnection(url,user,password);
		
		//3ème étape: statement(pour executer les requetes Sql) 
		
		sta=co.createStatement();
	}
		//Si le try ne marche pas on utilise le catch
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
		
	}



