
package com.rpsoft.xsd.helloworld.restrictions.on.values;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stearingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stearingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PowerStearing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stearingType", namespace = "http://rpsoft.com/xsd/helloworld/restrictions/on/values")
@XmlEnum
public enum StearingType {

    @XmlEnumValue("PowerStearing")
    POWER_STEARING("PowerStearing");
    private final String value;

    StearingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StearingType fromValue(String v) {
        for (StearingType c: StearingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
