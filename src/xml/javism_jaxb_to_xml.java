package xml;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class javism_jaxb_to_xml {

    public static void main(String[] args)
    {
        //Переменная, ранее описанного класса(Customer):
        javism_jaxb customer = new javism_jaxb();
        customer.setId(100);
        customer.setName("Pavel");
        customer.setAge(99);
        try
        {
            File file = new File("jaxb.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(javism_jaxb.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //форматированный вывод
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, file);
            jaxbMarshaller.marshal(customer, System.out);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace();
        }
    }
}


