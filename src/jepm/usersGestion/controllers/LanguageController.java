package jepm.usersGestion.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jepm.usersGestion.model.Language;
import jepm.usersGestion.model.Language;

public class LanguageController {
	
	/**
	 * 
	 * @return
	 */
	public static List<Language> countryFindAll(int id) {
		List<Language> list = new ArrayList<Language>();
		
		try {
			Connection conn = ConnectionManager.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from idioma where idPais like " + id);
			
			while (rs.next()) {
				Language language = new Language();
				language.setId(rs.getInt("id"));
				language.setDescripcion(rs.getString("descripcion"));
				language.setIdPais(rs.getInt("idPais"));
				list.add(language);
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
	 * 
	 * 
	 */
	public static int getLanguageId(String nombre) throws ClassNotFoundException, SQLException {
		
		Connection conn = ConnectionManager.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from idioma where descripcion like '" + nombre + "'");
		
		rs.next();
		
		return rs.getInt("id");
		
	}
}
