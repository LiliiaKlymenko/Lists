package Weather;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public interface DAOfactory {

    /** Возвращает подключение к базе данных */
    public Connection getConnection() throws SQLException;

    public WeatherDao getWeatherDao(Connection connection);
    public RegoinDao getRegoinDao(Connection connection);
    public ResidentsDao getResidentsDao(Connection connection);

}
