package Weather;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public interface WeatherDao {

    /**
     * Вывести сведения о погоде в заданном регионе.
     */
    public List<Weather> getWeatherInRegion(String nameRegion) throws SQLException;


    /**
     * Вывести даты, когда в заданном регионе шел снег и температура была ниже заданной отрицательной.
     */
    public List<Date> getDatesByWeather(double teperature, boolean precipitation);


    /**
     * Вывести информацию о погоде за прошедшую неделю в регионах, жители которых общаются на заданном языке.
     */
    public List<Weather> getWeatherByResidentsLanguage(String language);


    /**
     * Вывести среднюю температуру за прошедшую неделю в регионах с площадью больше заданной.
     */
    public double getAverageTemperatureByRegionsSquare(double square);



}
