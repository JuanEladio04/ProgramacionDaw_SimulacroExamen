package jepm.usersGestion.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jepm.usersGestion.model.User;
import jepm.usersGestion.model.User;

public class ControllerUsers {
	
	/**
	 * 
	 * @return
	 */
	public static List<User> countryFindAll() {
		List<User> list = new ArrayList<User>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from pais");
			
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("usuario"));
				user.setIdIdioma(rs.getInt("idIdioma"));
				list.add(user);
				
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 * @throws ClassNotFoundException 
	 */
	public static int insertUsert (User u) throws ClassNotFoundException {
		
		try {
			Connection conn = ConnectionManager.getConnection();
			PreparedStatement ps = conn.prepareStatement(
					"insert into usuario values (?, ?, ?, ?, ?)");
		
			ps.setInt(1, getNextValidId(conn));
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getUsuario());
			ps.setString(4, u.getPassword());
			ps.setInt(5, u.getIdIdioma());
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 
	 * @param conexion
	 * @param tabla
	 * @return
	 * @throws SQLException
	 */
	private static int getNextValidId(Connection connection) throws SQLException {
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery("select max(id) as maximoId "
				+ "from usuario");
	
		if (rs.next()) {
			return rs.getInt(1) + 1;
		}
		
		return 1;
	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static List<String> getNameList() throws SQLException, ClassNotFoundException {
		List<String> stringList = new ArrayList<String>();
		
		Connection conn = ConnectionManager.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select usuario from usuario");
		
		while (rs.next()) {
			String name = rs.getString("usuario"); 
			stringList.add(name);
		}
		
		return stringList;
		
	}

}
