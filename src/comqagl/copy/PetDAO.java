package comqagl.copy;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PetDAO implements Closeable {
	
	private final Connection conn;


	// constructor	
	public PetDAO(String url, String user, String pass) throws SQLException {
		super();
		this.conn = DriverManager.getConnection(url, user, pass);
	}	
	
	
	public List<Pet> read () {
		List<Pet> petsList = new ArrayList<>();
		
		try (Statement stmt = conn.createStatement();
				ResultSet results = stmt.executeQuery("SELECT * FROM pets");){
			
					
			while (results.next()) {
				int id = results.getInt(1);
				String name = results.getString("name");
				String owner = results.getString("owner");
				String sex = results.getString("sex");
				String birthdate = results.getString("birthdate");
				String species = results.getString("species");
				
				petsList.add(new Pet(id, name, owner, sex, birthdate, species));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return petsList;
	}


	@Override
	public void close() throws IOException {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
