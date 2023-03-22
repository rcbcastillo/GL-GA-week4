import java.sql.Connection;
import java.sql.DriverManager;

public class Demo {

	public static void main(String[] args) {

		// to connect to mysql we need to create a connection using DriverManager

		String url = "jdbc:mysql://localhost:3306/rutelypets";
		String user = "root";
		String password = "pass";

		Connection conn = null;

		try {
			System.out.println("Connecting to database................");
			conn = DriverManager.getConnection(url, user, password);
			// when connection successfully
			System.out.println("Conecction was succesful!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// after conn we can create statements to interact with a db
	}

}
