
package com.rpsoft.xsd.helloworld.restrictions.on.values;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="carType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mini"/>
 *     &lt;enumeration value="HBack"/>
 *     &lt;enumeration value="SUV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "carType", namespace = "http://rpsoft.com/xsd/helloworld/restrictions/on/values")
@XmlEnum
public enum CarType {

    @XmlEnumValue("Mini")
    MINI("Mini"),
    @XmlEnumValue("HBack")
    H_BACK("HBack"),
    SUV("SUV");
    private final String value;

    CarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarType fromValue(String v) {
        for (CarType c: CarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
