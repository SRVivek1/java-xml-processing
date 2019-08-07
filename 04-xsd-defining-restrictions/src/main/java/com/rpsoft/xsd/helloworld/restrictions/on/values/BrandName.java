
package com.rpsoft.xsd.helloworld.restrictions.on.values;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for brandName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="brandName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BMW"/>
 *     &lt;enumeration value="AUDI"/>
 *     &lt;enumeration value="Ferrari"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "brandName", namespace = "http://rpsoft.com/xsd/helloworld/restrictions/on/values")
@XmlEnum
public enum BrandName {

    BMW("BMW"),
    AUDI("AUDI"),
    @XmlEnumValue("Ferrari")
    FERRARI("Ferrari");
    private final String value;

    BrandName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrandName fromValue(String v) {
        for (BrandName c: BrandName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
