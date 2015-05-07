package XML_task;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import javax.xml.stream.XMLInputFactory;
/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class PlaneStAXPrser extends StAX_parser {

// реализация абстрактного метода из суперкласса для разбора потока

        public void parse(InputStream input) {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            try {
                XMLStreamReader reader =
                        inputFactory.createXMLStreamReader(input);
                process(reader);
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
        }

// метод, управляющий разбором потока

        public void process(XMLStreamReader reader)
                throws XMLStreamException {
            String name;
            while (reader.hasNext()) {
// определение типа "прочтённого" элемента (тега)
                int type = reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT:
                        name = reader.getLocalName();
                        switch (ParserEnum.valueOf(name.toUpperCase())) {
                            case PLANES:
                                writeTitle();
                                break;

                            case CHARS:
                                writeCharsStart(name);
                                break;

                            case PARAMETERS:
                                writePeremetersStart(name);
                                break;

                            case PLANE:
                                writePlaneStart();
                                break;

                            default:
                                writePlaneFeatureStart(name);
                                break;
                        }

                        break;

                    case XMLStreamConstants.END_ELEMENT:

                        name = reader.getLocalName();

                        switch (ParserEnum.valueOf(name.toUpperCase())) {

                            case PLANE:

                                writePlaneEnd();

                                break;

                            case CHARS:

                                writeCharsEnd();

                                break;

                            case PARAMETERS:

                                writePeremetersEnd();

                                break;

                            default:

                                writePlaneFeatureEnd();

                                break;

                        }

                        break;

                    case XMLStreamConstants.CHARACTERS:

                        writeText(reader.getText());

                        break;

                    default:

                        break;

                }

            }

        }

    }