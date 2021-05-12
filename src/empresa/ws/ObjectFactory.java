
package empresa.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the empresa.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalcularSueldo_QNAME = new QName("http://ws.empresa/", "calcularSueldo");
    private final static QName _CalcularSueldoResponse_QNAME = new QName("http://ws.empresa/", "calcularSueldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: empresa.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularSueldoResponse }
     * 
     */
    public CalcularSueldoResponse createCalcularSueldoResponse() {
        return new CalcularSueldoResponse();
    }

    /**
     * Create an instance of {@link CalcularSueldo }
     * 
     */
    public CalcularSueldo createCalcularSueldo() {
        return new CalcularSueldo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSueldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.empresa/", name = "calcularSueldo")
    public JAXBElement<CalcularSueldo> createCalcularSueldo(CalcularSueldo value) {
        return new JAXBElement<CalcularSueldo>(_CalcularSueldo_QNAME, CalcularSueldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularSueldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.empresa/", name = "calcularSueldoResponse")
    public JAXBElement<CalcularSueldoResponse> createCalcularSueldoResponse(CalcularSueldoResponse value) {
        return new JAXBElement<CalcularSueldoResponse>(_CalcularSueldoResponse_QNAME, CalcularSueldoResponse.class, null, value);
    }

}
