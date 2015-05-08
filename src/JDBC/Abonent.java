package JDBC;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class Abonent extends Entity {
    private int phone;
    private String lastname;

    public Abonent(int id, int phone, String lastname) {
        super(id);
        this.phone = phone;
        this.lastname = lastname;
    }
    public Abonent(){
        super();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Abonent{" +
                "phone=" + phone +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
