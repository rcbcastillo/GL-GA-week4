package comqagl.copy;

import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCLearning {
   public static void main(String[] args) {
      String url = "jdbc:mysql://127.0.0.1:3306/rutelypets";
      String user = "root";
      String password = "pass";
      Connection conn = null;
      try {
         System.out.println("Connecting to database..............."+ url);
         conn=DriverManager.getConnection(url, user, password);
         System.out.println("Connection is successful!!!!!!" + conn);
      }
      catch(Exception e) {
         e.printStackTrace();
      }
   }
}