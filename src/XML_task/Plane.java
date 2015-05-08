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

    public Plane(String origin, String model, double price, List<Object> characters, List<Object> parameters) {
        this.origin = origin;
        this.model = model;
        this.price = price;
        this.characters = characters;
        this.parameters = parameters;
    }

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

    public List<Object> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Object> characters) {
        this.characters = characters;
    }

    public List<Object> getParameters() {
        return parameters;
    }

    public void setParameters(List<Object> parameters) {
        this.parameters = parameters;
    }

    List<Object> characters = new ArrayList<Object>();
    List<Object> parameters = new ArrayList<Object>();


    @Override
    public String toString() {
        return "Plane{" +
                "origin='" + origin + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", characters=" + characters.toString() +
                ", parameters=" + parameters.toString() +
                '}';
    }
}
