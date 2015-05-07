package xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
@XmlRootElement
public class javism_jaxb {

        String name;
        int age;
        int id;

        public String getName()
        {
            return name;
        }

        @XmlElement
        public void setName(String name)
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }

        @XmlElement
        public void setAge(int age)
        {
            this.age = age;
        }

        public int getId()
        {
            return id;
        }

        @XmlAttribute
        public void setId(int id)
        {
            this.id = id;
        }
    }
