package abstractfactory;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
@Slf4j
public class AbstractFactoryEverydayDemo {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        String xml = "<document><body><stock>AAPL</stock></body></document>";
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        Document doc = factory.parse(bais);

        doc.getDocumentElement().normalize();

        log.debug("Root element : [{}]", doc.getDocumentElement().getNodeName());
        log.debug(String.valueOf(abstractFactory.getClass()));
        log.debug(String.valueOf(factory.getClass()));

    }
}
