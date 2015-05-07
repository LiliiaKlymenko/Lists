package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class javism_jaxb_xml_to_object {

    public static void main(String[] args)
    {
        try
        {
            File file = new File("jaxb.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(javism_jaxb.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            javism_jaxb customer = (javism_jaxb)jaxbUnmarshaller.unmarshal(file);

            System.out.println("Customer: " + customer.getName() +
                    "(id='" + customer.getId() +
                    "',age='" + customer.getAge() +
                    "')");
        }
        catch (JAXBException jaxbe)
        {
            System.out.println(jaxbe.getLocalizedMessage());
            jaxbe.printStackTrace();
        }
    }
}


