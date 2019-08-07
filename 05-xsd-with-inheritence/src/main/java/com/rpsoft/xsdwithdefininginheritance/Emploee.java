
package com.rpsoft.xsdwithdefininginheritance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Emploee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emploee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rpsoft.com/XsdWithDefiningInheritance}person">
 *       &lt;sequence>
 *         &lt;element name="eployeeID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-z0-9._]{10}"/>
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emploee", namespace = "http://rpsoft.com/XsdWithDefiningInheritance", propOrder = {
    "eployeeID"
})
public class Emploee
    extends Person
{

    @XmlElement(namespace = "http://rpsoft.com/XsdWithDefiningInheritance", required = true)
    protected String eployeeID;

    /**
     * Gets the value of the eployeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEployeeID() {
        return eployeeID;
    }

    /**
     * Sets the value of the eployeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEployeeID(String value) {
        this.eployeeID = value;
    }

}
