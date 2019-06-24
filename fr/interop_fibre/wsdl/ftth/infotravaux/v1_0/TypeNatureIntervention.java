
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeNatureIntervention.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeNatureIntervention">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPL"/>
 *     &lt;enumeration value="REFE"/>
 *     &lt;enumeration value="DSCM"/>
 *     &lt;enumeration value="EXTE"/>
 *     &lt;enumeration value="INGE"/>
 *     &lt;enumeration value="CHGC"/>
 *     &lt;enumeration value="AUTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeNatureIntervention")
@XmlEnum
public enum TypeNatureIntervention {

    DEPL,
    REFE,
    DSCM,
    EXTE,
    INGE,
    CHGC,
    AUTR;

    public String value() {
        return name();
    }

    public static TypeNatureIntervention fromValue(String v) {
        return valueOf(v);
    }

}
