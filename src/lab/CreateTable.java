package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class CreateTable {
    private final static String createTableQuery = "CREATE TABLE `books` (" +
            " `id` int(11) NOT NULL auto_increment," +
            " `title` varchar(50) default NULL," +
            " `comment` varchar(100) default NULL," +
            " `price` double default NULL," +
            " `author` varchar(50) default NULL," +
            " PRIMARY KEY (`id`)" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Statement statement = null;

        Class.forName("com.mysql.jdbc.Driver");
        //Подключаемся к новосозданной базе. Значение параметров после "?"
        //ясно из их имен.
        String url = "jdbc:mysql://localhost/bookstore" +
                "?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
        connection = DriverManager.getConnection(url, "root", "");
        statement = connection.createStatement();
        statement.executeUpdate(createTableQuery);

        if (statement != null) {

            statement.close();

        }

        connection.close();

    }
}
