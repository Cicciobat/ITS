
import java.io.IOException;
import java.sql.*;

public class DB {

        public static void main(String[] args) throws SQLException, IOException {

            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://192.168.70.20:3306/biblioteca", "user2", "Battaglia_2");
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM libro";

            System.out.println("\nInserimento dati nel database..");

            ResultSet rs = statement.executeQuery(query);

            System.out.println(rs.getClass());

            conn.close();

            System.out.println("Disconnessione riuscita.");


        }


    }
