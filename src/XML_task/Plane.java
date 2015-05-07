package XML_task;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Created by Liliia_Klymenko on 06-May-15.
 */

@XmlRootElement
public class Plane {

    String origin;
    String model;
    double price;

    public String getModel() {
        return model;
    }

    public String getOrigin() {
        return origin;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    List<Objects> characters = new ArrayList<Objects>();
    List<Objects> parameters = new ArrayList<Objects>();




}
