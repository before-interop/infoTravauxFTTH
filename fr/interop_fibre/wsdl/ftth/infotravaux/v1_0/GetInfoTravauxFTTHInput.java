
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getInfoTravauxFTTHInput complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getInfoTravauxFTTHInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceTPDERCO" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReference" minOccurs="0"/>
 *         &lt;element name="type" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeCategorie" minOccurs="0"/>
 *         &lt;element name="referencePrestationPm" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReferencePrestationPm" minOccurs="0"/>
 *         &lt;element name="dateCreation" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typePeriode" minOccurs="0"/>
 *         &lt;element name="dateDebutTravaux" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typePeriode" minOccurs="0"/>
 *         &lt;element name="dateFinTravaux" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typePeriode" minOccurs="0"/>
 *         &lt;element name="interventionRequiseOC" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeBooleen" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeEtat" minOccurs="0"/>
 *         &lt;element name="referencePriseImpactee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencePrestationPriseImpactee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInfoTravauxFTTHInput", propOrder = {
    "referenceTPDERCO",
    "type",
    "referencePrestationPm",
    "dateCreation",
    "dateDebutTravaux",
    "dateFinTravaux",
    "interventionRequiseOC",
    "etat",
    "referencePriseImpactee",
    "referencePrestationPriseImpactee"
})
public class GetInfoTravauxFTTHInput {

    protected String referenceTPDERCO;
    @XmlSchemaType(name = "string")
    protected TypeCategorie type;
    protected TypeReferencePrestationPm referencePrestationPm;
    protected TypePeriode dateCreation;
    protected TypePeriode dateDebutTravaux;
    protected TypePeriode dateFinTravaux;
    @XmlSchemaType(name = "string")
    protected TypeBooleen interventionRequiseOC;
    @XmlSchemaType(name = "string")
    protected TypeEtat etat;
    protected String referencePriseImpactee;
    protected String referencePrestationPriseImpactee;

    /**
     * Obtient la valeur de la propriété referenceTPDERCO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTPDERCO() {
        return referenceTPDERCO;
    }

    /**
     * Définit la valeur de la propriété referenceTPDERCO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTPDERCO(String value) {
        this.referenceTPDERCO = value;
    }

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link TypeCategorie }
     *     
     */
    public TypeCategorie getType() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCategorie }
     *     
     */
    public void setType(TypeCategorie value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété referencePrestationPm.
     * 
     * @return
     *     possible object is
     *     {@link TypeReferencePrestationPm }
     *     
     */
    public TypeReferencePrestationPm getReferencePrestationPm() {
        return referencePrestationPm;
    }

    /**
     * Définit la valeur de la propriété referencePrestationPm.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReferencePrestationPm }
     *     
     */
    public void setReferencePrestationPm(TypeReferencePrestationPm value) {
        this.referencePrestationPm = value;
    }

    /**
     * Obtient la valeur de la propriété dateCreation.
     * 
     * @return
     *     possible object is
     *     {@link TypePeriode }
     *     
     */
    public TypePeriode getDateCreation() {
        return dateCreation;
    }

    /**
     * Définit la valeur de la propriété dateCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriode }
     *     
     */
    public void setDateCreation(TypePeriode value) {
        this.dateCreation = value;
    }

    /**
     * Obtient la valeur de la propriété dateDebutTravaux.
     * 
     * @return
     *     possible object is
     *     {@link TypePeriode }
     *     
     */
    public TypePeriode getDateDebutTravaux() {
        return dateDebutTravaux;
    }

    /**
     * Définit la valeur de la propriété dateDebutTravaux.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriode }
     *     
     */
    public void setDateDebutTravaux(TypePeriode value) {
        this.dateDebutTravaux = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinTravaux.
     * 
     * @return
     *     possible object is
     *     {@link TypePeriode }
     *     
     */
    public TypePeriode getDateFinTravaux() {
        return dateFinTravaux;
    }

    /**
     * Définit la valeur de la propriété dateFinTravaux.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePeriode }
     *     
     */
    public void setDateFinTravaux(TypePeriode value) {
        this.dateFinTravaux = value;
    }

    /**
     * Obtient la valeur de la propriété interventionRequiseOC.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleen }
     *     
     */
    public TypeBooleen getInterventionRequiseOC() {
        return interventionRequiseOC;
    }

    /**
     * Définit la valeur de la propriété interventionRequiseOC.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleen }
     *     
     */
    public void setInterventionRequiseOC(TypeBooleen value) {
        this.interventionRequiseOC = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link TypeEtat }
     *     
     */
    public TypeEtat getEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEtat }
     *     
     */
    public void setEtat(TypeEtat value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété referencePriseImpactee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePriseImpactee() {
        return referencePriseImpactee;
    }

    /**
     * Définit la valeur de la propriété referencePriseImpactee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePriseImpactee(String value) {
        this.referencePriseImpactee = value;
    }

    /**
     * Obtient la valeur de la propriété referencePrestationPriseImpactee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePrestationPriseImpactee() {
        return referencePrestationPriseImpactee;
    }

    /**
     * Définit la valeur de la propriété referencePrestationPriseImpactee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePrestationPriseImpactee(String value) {
        this.referencePrestationPriseImpactee = value;
    }

}
