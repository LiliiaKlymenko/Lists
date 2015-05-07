package xml;

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
public class javism_reader {    public static void main(String[] args)
{
    try
    {
        File xmlFile = new File("new.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(xmlFile);
        document.getDocumentElement().normalize();

        System.out.println("Root element: " + document.getDocumentElement().getNodeName());
        NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
        System.out.println("--------------------");
        for(int tmp = 0; tmp < nodeList.getLength(); tmp++)
        {
            Node node = nodeList.item(tmp);
            if(node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element element = (Element)node;
                System.out.println("Blog #" + tmp + ":");
                System.out.println("Author: " + element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                System.out.println("Language: " + element.getElementsByTagName("language").item(0).getChildNodes().item(0).getNodeValue());
            }
        }
    }
    catch (Exception e)
    {
        System.out.println(e.getLocalizedMessage());
        e.printStackTrace();
    }
}
}
