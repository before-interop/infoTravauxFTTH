
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeEquipementConcerne.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeEquipementConcerne">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="PMT"/>
 *     &lt;enumeration value="PBO"/>
 *     &lt;enumeration value="LIENPMPBO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeEquipementConcerne")
@XmlEnum
public enum TypeEquipementConcerne {

    PM,
    PMT,
    PBO,
    LIENPMPBO;

    public String value() {
        return name();
    }

    public static TypeEquipementConcerne fromValue(String v) {
        return valueOf(v);
    }

}
