
package Proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Proxy package. 
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

    private static final QName _ConversionToDH_QNAME = new QName("http://ServerJWS/", "conversionToDH");
    private static final QName _ConversionToDHResponse_QNAME = new QName("http://ServerJWS/", "conversionToDHResponse");
    private static final QName _CreateNewCompte_QNAME = new QName("http://ServerJWS/", "createNewCompte");
    private static final QName _CreateNewCompteResponse_QNAME = new QName("http://ServerJWS/", "createNewCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionToDH }
     * 
     * @return
     *     the new instance of {@link ConversionToDH }
     */
    public ConversionToDH createConversionToDH() {
        return new ConversionToDH();
    }

    /**
     * Create an instance of {@link ConversionToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionToDHResponse }
     */
    public ConversionToDHResponse createConversionToDHResponse() {
        return new ConversionToDHResponse();
    }

    /**
     * Create an instance of {@link CreateNewCompte }
     * 
     * @return
     *     the new instance of {@link CreateNewCompte }
     */
    public CreateNewCompte createCreateNewCompte() {
        return new CreateNewCompte();
    }

    /**
     * Create an instance of {@link CreateNewCompteResponse }
     * 
     * @return
     *     the new instance of {@link CreateNewCompteResponse }
     */
    public CreateNewCompteResponse createCreateNewCompteResponse() {
        return new CreateNewCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ServerJWS/", name = "conversionToDH")
    public JAXBElement<ConversionToDH> createConversionToDH(ConversionToDH value) {
        return new JAXBElement<>(_ConversionToDH_QNAME, ConversionToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ServerJWS/", name = "conversionToDHResponse")
    public JAXBElement<ConversionToDHResponse> createConversionToDHResponse(ConversionToDHResponse value) {
        return new JAXBElement<>(_ConversionToDHResponse_QNAME, ConversionToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ServerJWS/", name = "createNewCompte")
    public JAXBElement<CreateNewCompte> createCreateNewCompte(CreateNewCompte value) {
        return new JAXBElement<>(_CreateNewCompte_QNAME, CreateNewCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ServerJWS/", name = "createNewCompteResponse")
    public JAXBElement<CreateNewCompteResponse> createCreateNewCompteResponse(CreateNewCompteResponse value) {
        return new JAXBElement<>(_CreateNewCompteResponse_QNAME, CreateNewCompteResponse.class, null, value);
    }

}
