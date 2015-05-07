package XML_task;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;


/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class DOM_parser {

    public static void main(String[] args)  {
        try
        {
            File xmlFile = new File("plane.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
            System.out.println("--------------------");
            for(int tmp = 0; tmp < nodeList.getLength()+0; tmp++) {
                Node node = nodeList.item(tmp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("\nPlane #" + tmp + ":");
                    System.out.println("Model: " + element.getElementsByTagName("model").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Origin: " + element.getElementsByTagName("origin").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("price: " + element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue());

                    NodeList char_nodeList = document.getElementsByTagName("chars");
                    System.out.println("Description:");

                        Node char_node = char_nodeList.item(0);
                        if (char_node.getNodeType() == Node.ELEMENT_NODE) {
                            Element char_element = (Element) char_node;
                            System.out.println("--Class: " + char_element.getElementsByTagName("class").item(0).getChildNodes().item(0).getNodeValue());
                            System.out.println("--Seats: " + char_element.getElementsByTagName("seats").item(0).getChildNodes().item(0).getNodeValue());
                            System.out.println("--Crewseats: " + char_element.getElementsByTagName("crewseats").item(0).getChildNodes().item(0).getNodeValue());
                            System.out.println("--Capasity: " + char_element.getElementsByTagName("capasity").item(0).getChildNodes().item(0).getNodeValue());
                            System.out.println("--Radar: " + char_element.getElementsByTagName("radar").item(0).getChildNodes().item(0).getNodeValue());
                        }



                    NodeList param_nodeList = document.getElementsByTagName("parameters");
                    System.out.println("Parameters:");

                        Node param_node = param_nodeList.item(0);
                        if (param_node.getNodeType() == Node.ELEMENT_NODE) {
                            Element param_element = (Element) param_node;
                            System.out.println("--Length: " + param_element.getElementsByTagName("length").item(0).getChildNodes().item(0).getNodeValue());
                            System.out.println("--Width: " + param_element.getElementsByTagName("width").item(0).getChildNodes().item(0).getNodeValue());
                            System.out.println("--Height: " + param_element.getElementsByTagName("height").item(0).getChildNodes().item(0).getNodeValue());
                        }
                    }
                System.out.println("--------------------");
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }



}
