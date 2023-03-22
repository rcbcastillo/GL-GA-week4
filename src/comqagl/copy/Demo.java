package comqagl.copy;
import java.io.IOException;
import java.sql.SQLException;

public class Demo {
	
	

	public static void main(String[] args) {
		try (PetDAO petsdao = new PetDAO("jdbc:mysql://127.0.0.1:3306/rutelypets", "root", "pass")) {
			petsdao.read();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
