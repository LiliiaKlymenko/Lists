package Weather;

import JDBC.*;

import java.sql.*;
import java.util.*;
import java.util.Date;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class MysqlWeatherDao implements WeatherDao {
    public static final String SQL_GET_WEATHER_IN_REGION="SELECT  `data` ,  `temperature` ,  `precipitation` FROM  `weather` JOIN  `region` ON  `region`.`id_region` =  `weather`.`id_region` WHERE ( `region`.`name` =  \"?\")";
            public static final String SQL_GET_DATES_BY_WEATHER="";
    public static final String SQL_GET_AVERAGE_TEMPERATURE_BY_REGIONS_SQUARE="";
    public static final String SQL_GET_WEATHER_BY_RESIDENTS_LANGUAGE="";

    private final Connection connection;

    public MysqlWeatherDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Weather> getWeatherInRegion(String nameRegion) throws SQLException {

         List<Weather> weatherList = new ArrayList<>();
        PreparedStatement stm = connection.prepareStatement(SQL_GET_WEATHER_IN_REGION);
        stm.setString(1, nameRegion);
        ResultSet rs = stm.executeQuery();
        rs.next();

        while(rs.next()){
            Date date = rs.getDate("date");
            double  temperature=rs.getDouble("temperature");
            boolean precipitation=rs.getBoolean("precipitation");
            weatherList.add(new Weather(date,temperature,precipitation));
        }

        return weatherList;
    }


    @Override
    public List<Date> getDatesByWeather(double teperature, boolean precipitation) {

        return null;
    }

    @Override
    public List<Weather> getWeatherByResidentsLanguage(String language) {

        return null;
    }

    @Override
    public double getAverageTemperatureByRegionsSquare(double square) {

        return square;
    }
}
