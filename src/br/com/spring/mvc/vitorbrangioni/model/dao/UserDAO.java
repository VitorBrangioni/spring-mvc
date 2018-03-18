
package br.com.spring.mvc.vitorbrangioni.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.spring.mvc.vitorbrangioni.model.User;
import br.com.spring.mvc.vitorbrangioni.model.connection.Connection;

public class UserDAO {
	
	private java.sql.Connection conn;
	
	public UserDAO() {
		this.conn = Connection.getConnection();
	}
	
	public void insert(User user) {
		try {
			String sql = "insert into user values (?, ?, ?, ?)";
			PreparedStatement ps;
			
			ps = this.conn.prepareStatement(sql);
			ps.setString(1, null);
			ps.setString(2, user.getName());
			ps.setString(3, user.getFamilyName());
			ps.setString(4, user.getCpf());
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<User> show() {
		List<User> users = new ArrayList<>();
		try {
			String sql = "select * from user";
			PreparedStatement ps = this.conn.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			
			
			while (result.next()) {
				User user = new User();
				user.setName(result.getString("name"));
				user.setFamilyName(result.getString("family_name"));
				user.setCpf(result.getString("cpf"));
				
				users.add(user);
				
				System.out.println(user.getName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}
	
	

}
