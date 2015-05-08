package Weather;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class Region {

    private String nameRegion;
    private double square;
    private int residentsId;

    protected  Region(String nameRegion, double square, int residentsId) {
        this.nameRegion = nameRegion;
        this.square = square;
        this.residentsId = residentsId;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getResidentsId() {
        return residentsId;
    }

    public void setResidentsId(int residentsId) {
        this.residentsId = residentsId;
    }
}

/*ƒл€ регионов необходимо хранить:
        Ч название;
        Ч площадь;
        Ч тип жителей.
*/

