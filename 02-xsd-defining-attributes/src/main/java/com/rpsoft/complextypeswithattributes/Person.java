
package com.rpsoft.complextypeswithattributes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/all>
 *       &lt;attribute name="nickName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="gfNames" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", namespace = "http://rpsoft.com/ComplexTypesWithAttributes", propOrder = {

})
public class Person {

    @XmlElement(namespace = "http://rpsoft.com/ComplexTypesWithAttributes", required = true, defaultValue = "First Name")
    protected String fName;
    @XmlElement(namespace = "http://rpsoft.com/ComplexTypesWithAttributes", required = true, defaultValue = "Last Name")
    protected String lName;
    @XmlElement(namespace = "http://rpsoft.com/ComplexTypesWithAttributes", required = true, defaultValue = "9878654321")
    protected BigInteger mobile;
    @XmlAttribute(name = "nickName", required = true)
    protected String nickName;
    @XmlAttribute(name = "gfNames", required = true)
    protected String gfNames;

    /**
     * Gets the value of the fName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFName() {
        return fName;
    }

    /**
     * Sets the value of the fName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFName(String value) {
        this.fName = value;
    }

    /**
     * Gets the value of the lName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLName() {
        return lName;
    }

    /**
     * Sets the value of the lName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLName(String value) {
        this.lName = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMobile(BigInteger value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the gfNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfNames() {
        return gfNames;
    }

    /**
     * Sets the value of the gfNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfNames(String value) {
        this.gfNames = value;
    }

}
