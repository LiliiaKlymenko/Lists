package lab;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {

    public static void main(String[] args) throws SQLException {

        //у MySQL обязательно есть системная база,
        //к ней и будем создавать соединение.

        String url = "jdbc:mysql://localhost/mysql";
        String name = "root";
        String password ="";




            Connection con = DriverManager.getConnection(url, name, password);

            System.out.println("Connected.");

            con.close();

            System.out.println("Disconnected.");

        }
}
