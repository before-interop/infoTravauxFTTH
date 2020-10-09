
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getInfoTravauxFTTHOutput complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getInfoTravauxFTTHOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listeTravaux" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeListeTravaux" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoTravauxFTTHOutput", propOrder = {
    "listeTravaux"
})
public class GetInfoTravauxFTTHOutput {

    protected TypeListeTravaux listeTravaux;

    /**
     * Obtient la valeur de la propriété listeTravaux.
     * 
     * @return
     *     possible object is
     *     {@link TypeListeTravaux }
     *     
     */
    public TypeListeTravaux getListeTravaux() {
        return listeTravaux;
    }

    /**
     * Définit la valeur de la propriété listeTravaux.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeListeTravaux }
     *     
     */
    public void setListeTravaux(TypeListeTravaux value) {
        this.listeTravaux = value;
    }

}
