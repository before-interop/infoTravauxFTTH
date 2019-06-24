
package fr.interop_fibre.wsdl.ftth.infotravaux.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeCategorie.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCategorie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TP"/>
 *     &lt;enumeration value="DERCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCategorie")
@XmlEnum
public enum TypeCategorie {

    TP,
    DERCO;

    public String value() {
        return name();
    }

    public static TypeCategorie fromValue(String v) {
        return valueOf(v);
    }

}
