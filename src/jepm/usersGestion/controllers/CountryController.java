package jepm.usersGestion.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jepm.usersGestion.model.Country;

public class CountryController {
	
	/**
	 * 
	 * @return
	 */
	public static List<Country> countryFindAll() {
		List<Country> list = new ArrayList<Country>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from pais");
			
			while (rs.next()) {
				Country country = new Country();
				country.setId(rs.getInt("id"));
				country.setDescripcion(rs.getString("descripcion"));
				list.add(country);
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static int getCountryId(String nombre) throws ClassNotFoundException, SQLException {
		
		Connection conn = ConnectionManager.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from pais where descripcion like '" + nombre + "'");
		
		rs.next();
		
		return rs.getInt("id");
		
	}

}
