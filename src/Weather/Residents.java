package Weather;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class Residents{

    private int residentsId;
    private String nameResidents;
    private String language;

    protected Residents(int id, String nameResidents, String language) {
        this.residentsId = residentsId;
        this.nameResidents = nameResidents;
        this.language = language;
    }


    public int getResidentsId() {
        return residentsId;
    }

    public void setResidentsId(int residentsId) {
        this.residentsId = residentsId;
    }

   public String getNameResidents() {
        return nameResidents;

    }

    public void setNameResidents(String nameResidents) {
        this.nameResidents = nameResidents;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

/*
ƒл€ типов жителей необходимо хранить:
        Ч название;
        Ч €зык общени€.
*/
