package br.com.spring.mvc.vitorbrangioni.model.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {
	
	private static java.sql.Connection conn;
	
	private Connection() {
	}
	
	private static void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/springmvc", "root", "");
			System.out.println("db connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static java.sql.Connection getConnection() {
		if (conn == null) {
			connect();
		}
		return conn;
	}

}
