package jepm.usersGestion.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControllerAcuerdo {
	
	/**
	 * 
	 * @param languageID
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static String getDescription(int languageID) throws ClassNotFoundException, SQLException {
		
		Connection conn = ConnectionManager.getConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select descripcion from acuerdo where idIdioma like " + languageID);
		
		rs.next();
		
		return rs.getString("descripcion");
	}

}
