package Weather;

import java.util.Date;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class Weather {

    private int weatherId;
    private int regionId;
    private  Date date;
    private double teperature;
    private boolean precipitation;

    protected Weather(int weatherId, int regionId, Date date, double teperature, boolean precipitation) {
        this.weatherId = weatherId;
        this.regionId = regionId;
        this.date = date;
        this.teperature = teperature;
        this.precipitation = precipitation;
    }

    public Weather(Date date, double teperature, boolean precipitation) {
        this.date = date;
        this.teperature = teperature;
        this.precipitation = precipitation;
    }

    public Weather() {
    }


    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }


    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public boolean isPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(boolean precipitation) {
        this.precipitation = precipitation;
    }

    public double getTeperature() {
        return teperature;
    }

    public void setTeperature(double teperature) {
        this.teperature = teperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

/*
ƒл€ погоды необходимо хранить:
        Ч регион;
        Ч дату;
        Ч температуру;
        Ч осадки.
*/
