
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.interop_fibre.wsdl.ftth.infotravaux.v1_0 package. 
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

    private final static QName _InfoTravauxFTTHHeader_QNAME = new QName("http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0", "InfoTravauxFTTHHeader");
    private final static QName _GetInfoTravauxFTTHRequest_QNAME = new QName("http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0", "getInfoTravauxFTTHRequest");
    private final static QName _GetInfoTravauxFTTHResponse_QNAME = new QName("http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0", "getInfoTravauxFTTHResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.interop_fibre.wsdl.ftth.infotravaux.v1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoTravauxFTTHOutput }
     * 
     */
    public GetInfoTravauxFTTHOutput createGetInfoTravauxFTTHOutput() {
        return new GetInfoTravauxFTTHOutput();
    }

    /**
     * Create an instance of {@link GetInfoTravauxFTTHInput }
     * 
     */
    public GetInfoTravauxFTTHInput createGetInfoTravauxFTTHInput() {
        return new GetInfoTravauxFTTHInput();
    }

    /**
     * Create an instance of {@link InfoFtthError }
     * 
     */
    public InfoFtthError createInfoFtthError() {
        return new InfoFtthError();
    }

    /**
     * Create an instance of {@link TypeHeader }
     * 
     */
    public TypeHeader createTypeHeader() {
        return new TypeHeader();
    }

    /**
     * Create an instance of {@link TypePeriode }
     * 
     */
    public TypePeriode createTypePeriode() {
        return new TypePeriode();
    }

    /**
     * Create an instance of {@link TypeReferencePrestationPm }
     * 
     */
    public TypeReferencePrestationPm createTypeReferencePrestationPm() {
        return new TypeReferencePrestationPm();
    }

    /**
     * Create an instance of {@link TypeListeTravaux }
     * 
     */
    public TypeListeTravaux createTypeListeTravaux() {
        return new TypeListeTravaux();
    }

    /**
     * Create an instance of {@link TypeReferencePBO }
     * 
     */
    public TypeReferencePBO createTypeReferencePBO() {
        return new TypeReferencePBO();
    }

    /**
     * Create an instance of {@link TypeReferencePmTechnique }
     * 
     */
    public TypeReferencePmTechnique createTypeReferencePmTechnique() {
        return new TypeReferencePmTechnique();
    }

    /**
     * Create an instance of {@link TypeReferencePm }
     * 
     */
    public TypeReferencePm createTypeReferencePm() {
        return new TypeReferencePm();
    }

    /**
     * Create an instance of {@link TypeReferencePriseImpactees }
     * 
     */
    public TypeReferencePriseImpactees createTypeReferencePriseImpactees() {
        return new TypeReferencePriseImpactees();
    }

    /**
     * Create an instance of {@link TypeTravaux }
     * 
     */
    public TypeTravaux createTypeTravaux() {
        return new TypeTravaux();
    }

    /**
     * Create an instance of {@link TypeReferencePrestationPriseImpactees }
     * 
     */
    public TypeReferencePrestationPriseImpactees createTypeReferencePrestationPriseImpactees() {
        return new TypeReferencePrestationPriseImpactees();
    }

    /**
     * Create an instance of {@link TypeIdentifiantImmeuble }
     * 
     */
    public TypeIdentifiantImmeuble createTypeIdentifiantImmeuble() {
        return new TypeIdentifiantImmeuble();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0", name = "InfoTravauxFTTHHeader")
    public JAXBElement<TypeHeader> createInfoTravauxFTTHHeader(TypeHeader value) {
        return new JAXBElement<TypeHeader>(_InfoTravauxFTTHHeader_QNAME, TypeHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoTravauxFTTHInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0", name = "getInfoTravauxFTTHRequest")
    public JAXBElement<GetInfoTravauxFTTHInput> createGetInfoTravauxFTTHRequest(GetInfoTravauxFTTHInput value) {
        return new JAXBElement<GetInfoTravauxFTTHInput>(_GetInfoTravauxFTTHRequest_QNAME, GetInfoTravauxFTTHInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoTravauxFTTHOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0", name = "getInfoTravauxFTTHResponse")
    public JAXBElement<GetInfoTravauxFTTHOutput> createGetInfoTravauxFTTHResponse(GetInfoTravauxFTTHOutput value) {
        return new JAXBElement<GetInfoTravauxFTTHOutput>(_GetInfoTravauxFTTHResponse_QNAME, GetInfoTravauxFTTHOutput.class, null, value);
    }

}
