
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeEtat.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEtat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOUVEAU"/>
 *     &lt;enumeration value="REPLANIFICATION"/>
 *     &lt;enumeration value="MAJ"/>
 *     &lt;enumeration value="CLOTURE"/>
 *     &lt;enumeration value="ANNULE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeEtat")
@XmlEnum
public enum TypeEtat {

    NOUVEAU,
    REPLANIFICATION,
    MAJ,
    CLOTURE,
    ANNULE;

    public String value() {
        return name();
    }

    public static TypeEtat fromValue(String v) {
        return valueOf(v);
    }

}
