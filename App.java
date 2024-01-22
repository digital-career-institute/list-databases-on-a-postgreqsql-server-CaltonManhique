package databaselister;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) {

		try {
			new DatabaseLister().connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
