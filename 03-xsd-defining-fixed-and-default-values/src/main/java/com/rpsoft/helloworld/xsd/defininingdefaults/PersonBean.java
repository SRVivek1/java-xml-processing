
package com.rpsoft.helloworld.xsd.defininingdefaults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}double" default="5.10" />
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}double" default="75" />
 *       &lt;attribute name="wife" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="WifeName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonBean", namespace = "http://rpsoft.com/helloworld/xsd/defininingdefaults/", propOrder = {
    "firstName",
    "lastName"
})
public class PersonBean {

    @XmlElement(namespace = "http://rpsoft.com/helloworld/xsd/defininingdefaults/", required = true, defaultValue = "Raju")
    protected String firstName;
    @XmlElement(namespace = "http://rpsoft.com/helloworld/xsd/defininingdefaults/", required = true)
    protected String lastName;
    @XmlAttribute(name = "height")
    protected Double height;
    @XmlAttribute(name = "weight")
    protected Double weight;
    @XmlAttribute(name = "wife", required = true)
    protected String wife;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getHeight() {
        if (height == null) {
            return  5.1D;
        } else {
            return height;
        }
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWeight() {
        if (weight == null) {
            return  75.0D;
        } else {
            return weight;
        }
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the wife property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWife() {
        if (wife == null) {
            return "WifeName";
        } else {
            return wife;
        }
    }

    /**
     * Sets the value of the wife property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWife(String value) {
        this.wife = value;
    }

}
