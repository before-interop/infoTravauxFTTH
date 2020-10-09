
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeRetour" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="messageRetour" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeRetour",
    "messageRetour"
})
@XmlRootElement(name = "infoFtthError")
public class InfoFtthError {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger codeRetour;
    @XmlElement(required = true)
    protected String messageRetour;

    /**
     * Obtient la valeur de la propriété codeRetour.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodeRetour() {
        return codeRetour;
    }

    /**
     * Définit la valeur de la propriété codeRetour.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodeRetour(BigInteger value) {
        this.codeRetour = value;
    }

    /**
     * Obtient la valeur de la propriété messageRetour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRetour() {
        return messageRetour;
    }

    /**
     * Définit la valeur de la propriété messageRetour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRetour(String value) {
        this.messageRetour = value;
    }

}
