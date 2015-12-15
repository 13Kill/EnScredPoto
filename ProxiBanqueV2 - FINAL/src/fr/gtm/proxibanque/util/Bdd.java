package fr.gtm.proxibanque.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Bdd {

	//pilote:type de Driver==>aller ds propriete de connection ds Service
	private static String pilote = "oracle.jdbc.OracleDriver";
	//le nom du Driver==>reprendre nom ds propriete de connection ds Service
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	//login et password du Database User
	private static String utilisateur = "admin";
	private static String password = "admin";

	public static Connection seConnecter() {
		Connection cnx = null;
		try {
			Class.forName(pilote);
			cnx = DriverManager.getConnection(url, utilisateur, password);

		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
		}
		return cnx;
	}

	public static void seDeconnecter(Connection cnx) {

		try {
			cnx.close();
		} catch (SQLException ex) {
			Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
