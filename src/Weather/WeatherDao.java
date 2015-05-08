package Weather;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public interface WeatherDao {

    /**
     * ������� �������� � ������ � �������� �������.
     */
    public List<Weather> getWeatherInRegion(String nameRegion) throws SQLException;


    /**
     * ������� ����, ����� � �������� ������� ��� ���� � ����������� ���� ���� �������� �������������.
     */
    public List<Date> getDatesByWeather(double teperature, boolean precipitation);


    /**
     * ������� ���������� � ������ �� ��������� ������ � ��������, ������ ������� �������� �� �������� �����.
     */
    public List<Weather> getWeatherByResidentsLanguage(String language);


    /**
     * ������� ������� ����������� �� ��������� ������ � �������� � �������� ������ ��������.
     */
    public double getAverageTemperatureByRegionsSquare(double square);



}
