
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour typePeriode complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typePeriode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDebutRecherche" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinRecherche" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typePeriode", propOrder = {
    "dateDebutRecherche",
    "dateFinRecherche"
})
public class TypePeriode {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutRecherche;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinRecherche;

    /**
     * Obtient la valeur de la propriété dateDebutRecherche.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutRecherche() {
        return dateDebutRecherche;
    }

    /**
     * Définit la valeur de la propriété dateDebutRecherche.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutRecherche(XMLGregorianCalendar value) {
        this.dateDebutRecherche = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinRecherche.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinRecherche() {
        return dateFinRecherche;
    }

    /**
     * Définit la valeur de la propriété dateFinRecherche.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinRecherche(XMLGregorianCalendar value) {
        this.dateFinRecherche = value;
    }

}
