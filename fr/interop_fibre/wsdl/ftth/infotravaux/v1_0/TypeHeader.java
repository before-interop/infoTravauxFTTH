
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeHeader complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supplierID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceProviderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeHeader", propOrder = {
    "supplierID",
    "serviceProviderID"
})
public class TypeHeader {

    @XmlElement(required = true)
    protected String supplierID;
    @XmlElement(required = true)
    protected String serviceProviderID;

    /**
     * Obtient la valeur de la propriété supplierID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * Définit la valeur de la propriété supplierID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * Obtient la valeur de la propriété serviceProviderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderID() {
        return serviceProviderID;
    }

    /**
     * Définit la valeur de la propriété serviceProviderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderID(String value) {
        this.serviceProviderID = value;
    }

}
