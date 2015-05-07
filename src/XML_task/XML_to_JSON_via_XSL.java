package XML_task;



import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import net.sf.json.JSON;
import org.json.simple.JSONObject;
import sun.misc.IOUtils;

import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.*;
import javax.json.Json;
import org.json.JSONArray;
import org.json.XML;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class XML_to_JSON_via_XSL {


    public void XML_to_JSON(){
        try {

            InputStream input =  new FileInputStream("plane.xml");
            if (input != null) {
            String xml = input.toString();
            net.sf.json.xml.XMLSerializer xmlSerializer = new net.sf.json.xml.XMLSerializer();
            JSON json = xmlSerializer.read(xml);

            System.out.println(json.toString().split(",").length);
            for(int i= 0; i < json.toString().split(",").length; i ++)
                System.out.println(json.toString().split(",")[i]);
        } else {
            System.out.println("Checkpoint 1");
        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) throws TransformerException, XMLStreamException, IOException {
new XML_to_JSON_via_XSL().XML_to_JSON();
    }
}
