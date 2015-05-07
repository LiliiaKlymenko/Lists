package XML_task;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public abstract class StAX_parser {

        public abstract void parse(InputStream input);

    public void writeTitle() {

        System.out.println("Planes:");

    }

    public void writePlaneStart() {
        System.out.println("\n\nPlane: ");
    }

    public void writePlaneEnd() {

        System.out.println();

    }

    public void writeCharsStart(String name) {

        System.out.println(" Description start ");
        switch (ParserEnum.valueOf(name.toUpperCase())) {
            case CLASS:

                System.out.print("CLASS: ");

                break;


            case SEATS:

                System.out.print("SEATS");

                break;

            case CREWSEATS:

                System.out.print("CREWSEATS: ");

                break;

            case CAPASITY:

                System.out.print("CAPASITY: ");

                break;

            case RADAR:

                System.out.print("RADAR: ");

                break;
        }

    }

    public void writeCharsEnd() {

        System.out.println(" Description End ");

    }


    public void writePeremetersStart(String name) {

        System.out.println("  Peremeters Start ");
        switch (ParserEnum.valueOf(name.toUpperCase())) {
            case HEIGHT:

                System.out.print("HEIGHT: ");

                break;

            case WIDTH:

                System.out.print("WIDTH: ");

                break;

            case LENGTH:

                System.out.print("LENGTH: ");

                break;
        }

    }

    public void writePeremetersEnd() {

        System.out.println("  Peremeters End ");

    }

    public void writePlaneFeatureStart(String name) {

        switch (ParserEnum.valueOf(name.toUpperCase())) {


            case MODEL:

                System.out.print("MODEL: ");

                break;

            case ORIGIN:

                System.out.print("ORIGIN: ");

                break;

            case PRICE:

                System.out.print("PRICE: ");

                break;

        }

    }

    public void writePlaneFeatureEnd() {

        System.out.println();

    }

    public void writeText(String text) {

        System.out.print(text.trim());

    }

}
