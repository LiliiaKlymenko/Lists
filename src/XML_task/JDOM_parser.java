package XML_task;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liliia_Klymenko on 07-May-15.
 */
public class JDOM_parser {

    public static void main(String[] args) {

        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File("plane.xml");

        try {

            Document document = (Document) builder.build(xmlFile);
            Element rootNode = document.getRootElement();
            System.out.println("Root element: " + rootNode.getName().toString());

            List list = rootNode.getChildren("plane");

            Plane palne;
            for (int i = 0; i < list.size(); i++) {

                Element node = (Element) list.get(i);
                System.out.println("\nPlane #" + i + ":");


                System.out.println("Model : " + node.getChildText("model"));
                System.out.println("Origin : " + node.getChildText("origin"));
                System.out.println("Price : " + node.getChildText("price"));


                List chars = node.getChildren("chars");

                Element chars_list = (Element) chars.get(0);
                System.out.println("\nCharacteristics:");

                System.out.println("--Class: " + chars_list.getChildText("class"));
                System.out.println("--Seats: " + chars_list.getChildText("seats"));
                System.out.println("--Crewseats: " + chars_list.getChildText("crewseats"));
                System.out.println("--Capasity: " + chars_list.getChildText("capasity"));
                System.out.println("--Radar: " + chars_list.getChildText("radar"));

                List<Object> plane_chars = new ArrayList<Object>();
                plane_chars.add(chars_list.getChildText("class"));
                plane_chars.add(chars_list.getChildText("seats"));
                plane_chars.add(chars_list.getChildText("crewseats"));
                plane_chars.add(chars_list.getChildText("capasity"));
                plane_chars.add(chars_list.getChildText("radar"));

                List params = node.getChildren("parameters");

                Element params_list = (Element) params.get(0);
                System.out.println("\nParameters:");

                System.out.println("--Length: " + params_list.getChildText("length"));
                System.out.println("--Width: " + params_list.getChildText("width"));
                System.out.println("--Height: " + params_list.getChildText("height"));

                List<Object> plane_params = new ArrayList<Object>();
                plane_params.add(params_list.getChildText("length"));
                plane_params.add(params_list.getChildText("width"));
                plane_params.add(params_list.getChildText("height"));


                System.out.print(new Plane(node.getChildText("model"), node.getChildText("origin"), Double.parseDouble(node.getChildText("price")), plane_chars, plane_params).toString());
            }


        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
    }
}
