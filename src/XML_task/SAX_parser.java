package XML_task;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class SAX_parser {
    public static void main(String[] args)
    {
        try
        {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler()
            {
                boolean bModel = false;
                boolean bOrigin = false;
                boolean bPrice = false;

                boolean bClass = false;
                boolean bSeats = false;
                boolean bCrewseats = false;
                boolean bCapasity = false;
                boolean bRadar = false;

                boolean bLength = false;
                boolean bWidth = false;
                boolean bHight = false;


                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
                    System.out.println("\nStart element: " + qName);
                    if(qName.equalsIgnoreCase("Model")){
                        bModel = true;
                    }
                    if(qName.equalsIgnoreCase("Origin")){
                        bOrigin = true;
                    }
                    if(qName.equalsIgnoreCase("Price")){
                        bPrice = true;
                    }

                    if(qName.equalsIgnoreCase("Class")){
                        bClass = true;
                    }

                    if(qName.equalsIgnoreCase("Seats")){
                        bSeats = true;
                    }

                    if(qName.equalsIgnoreCase("Crewseats")){
                        bCrewseats = true;
                    }

                    if(qName.equalsIgnoreCase("Capasity")){
                        bCapasity = true;
                    }

                    if(qName.equalsIgnoreCase("Radar")){
                        bRadar = true;
                    }

                    if(qName.equalsIgnoreCase("Length")){
                        bLength = true;
                    }
                    if(qName.equalsIgnoreCase("Width")){
                        bWidth = true;
                    }
                    if(qName.equalsIgnoreCase("Hight")){
                        bHight = true;
                    }
                }

                public void endElement(String uri, String localName, String qName) throws SAXException{
                    System.out.println("End element: " + qName);
                }

                public void characters(char ch[], int start, int length) throws SAXException{
                    if(bModel){
                        System.out.println("Model: " + new String(ch, start, length));
                        bModel = false;
                    }
                    if(bOrigin){
                        System.out.println("Origin: " + new String(ch, start, length));
                        bOrigin = false;
                    }
                    if(bPrice){
                        System.out.println("Price: " + new String(ch, start, length));
                        bPrice = false;
                    }
                    if(bClass){
                        System.out.println("Class: " + new String(ch, start, length));
                        bClass = false;
                    }
                    if(bSeats){
                        System.out.println("Seats: " + new String(ch, start, length));
                        bSeats = false;
                    }
                    if(bCrewseats){
                        System.out.println("Crewseats: " + new String(ch, start, length));
                        bCrewseats = false;
                    }
                    if(bCapasity){
                        System.out.println("Capasity: " + new String(ch, start, length));
                        bCapasity = false;
                    }
                    if(bRadar){
                        System.out.println("Radar: " + new String(ch, start, length));
                        bRadar = false;
                    }


                    if(bLength){
                        System.out.println("Length: " + new String(ch, start, length));
                        bLength = false;
                    }
                    if(bHight){
                        System.out.println("Hight: " + new String(ch, start, length));
                        bHight = false;
                    }
                    if(bWidth){
                        System.out.println("Width: " + new String(ch, start, length));
                        bWidth = false;
                    }
                }
            };

            saxParser.parse("plane.xml", defaultHandler);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace();
        }
    }
}
