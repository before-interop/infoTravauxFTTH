
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeListeTravaux complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeListeTravaux">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travaux" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeTravaux" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeListeTravaux", propOrder = {
    "travaux"
})
public class TypeListeTravaux {

    protected List<TypeTravaux> travaux;

    /**
     * Gets the value of the travaux property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travaux property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravaux().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTravaux }
     * 
     * 
     */
    public List<TypeTravaux> getTravaux() {
        if (travaux == null) {
            travaux = new ArrayList<TypeTravaux>();
        }
        return this.travaux;
    }

}
