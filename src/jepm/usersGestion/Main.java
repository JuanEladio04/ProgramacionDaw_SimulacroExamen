package jepm.usersGestion;

import java.sql.Connection;
import java.sql.SQLException;

import jepm.usersGestion.controllers.ConnectionManager;
import jepm.usersGestion.view.MainWindow;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.getConnection();
		
		MainWindow.main(args);
	}

}
