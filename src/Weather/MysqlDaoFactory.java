package Weather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class MysqlDaoFactory {

    public class MySqlDaoFactory implements DAOfactory {

        private String user = "new_root";
        private String password = "1234";
        private String url = "jdbc:mysql://localhost/weather";
        private String driver = "com.mysql.jdbc.Driver";

        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }

        @Override
        public WeatherDao getWeatherDao(Connection connection) {
            return null;
        }

        @Override
        public RegoinDao getRegoinDao(Connection connection) {
            return null;
        }

        @Override
        public ResidentsDao getResidentsDao(Connection connection) {
            return null;
        }


        public MySqlDaoFactory() {
            try {
                Class.forName(driver);
            }

            //Регистрируем драйвер
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
