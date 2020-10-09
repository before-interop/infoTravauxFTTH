
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour typeTravaux complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeTravaux">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeCategorie"/>
 *         &lt;element name="equipementConcerne" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeEquipementConcerne"/>
 *         &lt;element name="referencePm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="referencePrestationPm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateModification" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="interventionRequiseOC" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeBooleen"/>
 *         &lt;element name="dateDebutTravaux" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateFinTravaux" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="travauxCuratifs" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeBooleen" minOccurs="0"/>
 *         &lt;element name="natureIntervention" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeNatureIntervention" minOccurs="0"/>
 *         &lt;element name="etat" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeEtat" minOccurs="0"/>
 *         &lt;element name="referencePBO" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReferencePBO" minOccurs="0"/>
 *         &lt;element name="referencePmTechnique" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReferencePmTechnique" minOccurs="0"/>
 *         &lt;element name="commentairesIntervention" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeCommentaire" minOccurs="0"/>
 *         &lt;element name="coordonneesContactOI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifiantImmeuble" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeIdentifiantImmeuble" minOccurs="0"/>
 *         &lt;element name="referencePriseImpactees" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReferencePriseImpactees" minOccurs="0"/>
 *         &lt;element name="referencePrestationPriseImpactees" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReferencePrestationPriseImpactees" minOccurs="0"/>
 *         &lt;element name="referenceIncident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentaireInterventionOC" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeCommentaire" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reference" use="required" type="{http://interop-fibre.fr/wsdl/ftth/infoTravaux/v1-0}typeReference" />
 *       &lt;attribute name="serviceProviderID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTravaux", propOrder = {
    "type",
    "equipementConcerne",
    "referencePm",
    "referencePrestationPm",
    "dateModification",
    "interventionRequiseOC",
    "dateDebutTravaux",
    "dateFinTravaux",
    "travauxCuratifs",
    "natureIntervention",
    "etat",
    "referencePBO",
    "referencePmTechnique",
    "commentairesIntervention",
    "coordonneesContactOI",
    "identifiantImmeuble",
    "referencePriseImpactees",
    "referencePrestationPriseImpactees",
    "referenceIncident",
    "commentaireInterventionOC"
})
public class TypeTravaux {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeCategorie type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeEquipementConcerne equipementConcerne;
    @XmlElement(required = true)
    protected String referencePm;
    @XmlElement(required = true)
    protected String referencePrestationPm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateModification;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeBooleen interventionRequiseOC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDebutTravaux;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinTravaux;
    @XmlSchemaType(name = "string")
    protected TypeBooleen travauxCuratifs;
    @XmlSchemaType(name = "string")
    protected TypeNatureIntervention natureIntervention;
    @XmlSchemaType(name = "string")
    protected TypeEtat etat;
    protected TypeReferencePBO referencePBO;
    protected TypeReferencePmTechnique referencePmTechnique;
    protected String commentairesIntervention;
    protected String coordonneesContactOI;
    protected TypeIdentifiantImmeuble identifiantImmeuble;
    protected TypeReferencePriseImpactees referencePriseImpactees;
    protected TypeReferencePrestationPriseImpactees referencePrestationPriseImpactees;
    protected String referenceIncident;
    protected String commentaireInterventionOC;
    @XmlAttribute(name = "reference", required = true)
    protected String reference;
    @XmlAttribute(name = "serviceProviderID", required = true)
    protected String serviceProviderID;

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
     * Obtient la valeur de la propriété equipementConcerne.
     * 
     * @return
     *     possible object is
     *     {@link TypeEquipementConcerne }
     *     
     */
    public TypeEquipementConcerne getEquipementConcerne() {
        return equipementConcerne;
    }

    /**
     * Définit la valeur de la propriété equipementConcerne.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEquipementConcerne }
     *     
     */
    public void setEquipementConcerne(TypeEquipementConcerne value) {
        this.equipementConcerne = value;
    }

    /**
     * Obtient la valeur de la propriété referencePm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePm() {
        return referencePm;
    }

    /**
     * Définit la valeur de la propriété referencePm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePm(String value) {
        this.referencePm = value;
    }

    /**
     * Obtient la valeur de la propriété referencePrestationPm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePrestationPm() {
        return referencePrestationPm;
    }

    /**
     * Définit la valeur de la propriété referencePrestationPm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePrestationPm(String value) {
        this.referencePrestationPm = value;
    }

    /**
     * Obtient la valeur de la propriété dateModification.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateModification() {
        return dateModification;
    }

    /**
     * Définit la valeur de la propriété dateModification.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateModification(XMLGregorianCalendar value) {
        this.dateModification = value;
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
     * Obtient la valeur de la propriété dateDebutTravaux.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDebutTravaux() {
        return dateDebutTravaux;
    }

    /**
     * Définit la valeur de la propriété dateDebutTravaux.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDebutTravaux(XMLGregorianCalendar value) {
        this.dateDebutTravaux = value;
    }

    /**
     * Obtient la valeur de la propriété dateFinTravaux.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinTravaux() {
        return dateFinTravaux;
    }

    /**
     * Définit la valeur de la propriété dateFinTravaux.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinTravaux(XMLGregorianCalendar value) {
        this.dateFinTravaux = value;
    }

    /**
     * Obtient la valeur de la propriété travauxCuratifs.
     * 
     * @return
     *     possible object is
     *     {@link TypeBooleen }
     *     
     */
    public TypeBooleen getTravauxCuratifs() {
        return travauxCuratifs;
    }

    /**
     * Définit la valeur de la propriété travauxCuratifs.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBooleen }
     *     
     */
    public void setTravauxCuratifs(TypeBooleen value) {
        this.travauxCuratifs = value;
    }

    /**
     * Obtient la valeur de la propriété natureIntervention.
     * 
     * @return
     *     possible object is
     *     {@link TypeNatureIntervention }
     *     
     */
    public TypeNatureIntervention getNatureIntervention() {
        return natureIntervention;
    }

    /**
     * Définit la valeur de la propriété natureIntervention.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNatureIntervention }
     *     
     */
    public void setNatureIntervention(TypeNatureIntervention value) {
        this.natureIntervention = value;
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
     * Obtient la valeur de la propriété referencePBO.
     * 
     * @return
     *     possible object is
     *     {@link TypeReferencePBO }
     *     
     */
    public TypeReferencePBO getReferencePBO() {
        return referencePBO;
    }

    /**
     * Définit la valeur de la propriété referencePBO.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReferencePBO }
     *     
     */
    public void setReferencePBO(TypeReferencePBO value) {
        this.referencePBO = value;
    }

    /**
     * Obtient la valeur de la propriété referencePmTechnique.
     * 
     * @return
     *     possible object is
     *     {@link TypeReferencePmTechnique }
     *     
     */
    public TypeReferencePmTechnique getReferencePmTechnique() {
        return referencePmTechnique;
    }

    /**
     * Définit la valeur de la propriété referencePmTechnique.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReferencePmTechnique }
     *     
     */
    public void setReferencePmTechnique(TypeReferencePmTechnique value) {
        this.referencePmTechnique = value;
    }

    /**
     * Obtient la valeur de la propriété commentairesIntervention.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentairesIntervention() {
        return commentairesIntervention;
    }

    /**
     * Définit la valeur de la propriété commentairesIntervention.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentairesIntervention(String value) {
        this.commentairesIntervention = value;
    }

    /**
     * Obtient la valeur de la propriété coordonneesContactOI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordonneesContactOI() {
        return coordonneesContactOI;
    }

    /**
     * Définit la valeur de la propriété coordonneesContactOI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordonneesContactOI(String value) {
        this.coordonneesContactOI = value;
    }

    /**
     * Obtient la valeur de la propriété identifiantImmeuble.
     * 
     * @return
     *     possible object is
     *     {@link TypeIdentifiantImmeuble }
     *     
     */
    public TypeIdentifiantImmeuble getIdentifiantImmeuble() {
        return identifiantImmeuble;
    }

    /**
     * Définit la valeur de la propriété identifiantImmeuble.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeIdentifiantImmeuble }
     *     
     */
    public void setIdentifiantImmeuble(TypeIdentifiantImmeuble value) {
        this.identifiantImmeuble = value;
    }

    /**
     * Obtient la valeur de la propriété referencePriseImpactees.
     * 
     * @return
     *     possible object is
     *     {@link TypeReferencePriseImpactees }
     *     
     */
    public TypeReferencePriseImpactees getReferencePriseImpactees() {
        return referencePriseImpactees;
    }

    /**
     * Définit la valeur de la propriété referencePriseImpactees.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReferencePriseImpactees }
     *     
     */
    public void setReferencePriseImpactees(TypeReferencePriseImpactees value) {
        this.referencePriseImpactees = value;
    }

    /**
     * Obtient la valeur de la propriété referencePrestationPriseImpactees.
     * 
     * @return
     *     possible object is
     *     {@link TypeReferencePrestationPriseImpactees }
     *     
     */
    public TypeReferencePrestationPriseImpactees getReferencePrestationPriseImpactees() {
        return referencePrestationPriseImpactees;
    }

    /**
     * Définit la valeur de la propriété referencePrestationPriseImpactees.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReferencePrestationPriseImpactees }
     *     
     */
    public void setReferencePrestationPriseImpactees(TypeReferencePrestationPriseImpactees value) {
        this.referencePrestationPriseImpactees = value;
    }

    /**
     * Obtient la valeur de la propriété referenceIncident.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceIncident() {
        return referenceIncident;
    }

    /**
     * Définit la valeur de la propriété referenceIncident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceIncident(String value) {
        this.referenceIncident = value;
    }

    /**
     * Obtient la valeur de la propriété commentaireInterventionOC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaireInterventionOC() {
        return commentaireInterventionOC;
    }

    /**
     * Définit la valeur de la propriété commentaireInterventionOC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaireInterventionOC(String value) {
        this.commentaireInterventionOC = value;
    }

    /**
     * Obtient la valeur de la propriété reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Définit la valeur de la propriété reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
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
