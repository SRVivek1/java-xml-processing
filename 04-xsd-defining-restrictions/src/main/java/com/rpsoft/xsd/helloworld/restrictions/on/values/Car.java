
package com.rpsoft.xsd.helloworld.restrictions.on.values;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://rpsoft.com/xsd/helloworld/restrictions/on/values}brandName"/>
 *         &lt;element name="car" type="{http://rpsoft.com/xsd/helloworld/restrictions/on/values}carType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="stearing" use="required" type="{http://rpsoft.com/xsd/helloworld/restrictions/on/values}stearingType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "brand",
    "car"
})
@XmlRootElement(name = "Car", namespace = "http://rpsoft.com/xsd/helloworld/restrictions/on/values")
public class Car {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BrandName brand;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CarType car;
    @XmlAttribute(name = "stearing", required = true)
    protected StearingType stearing;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link BrandName }
     *     
     */
    public BrandName getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandName }
     *     
     */
    public void setBrand(BrandName value) {
        this.brand = value;
    }

    /**
     * Gets the value of the car property.
     * 
     * @return
     *     possible object is
     *     {@link CarType }
     *     
     */
    public CarType getCar() {
        return car;
    }

    /**
     * Sets the value of the car property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarType }
     *     
     */
    public void setCar(CarType value) {
        this.car = value;
    }

    /**
     * Gets the value of the stearing property.
     * 
     * @return
     *     possible object is
     *     {@link StearingType }
     *     
     */
    public StearingType getStearing() {
        return stearing;
    }

    /**
     * Sets the value of the stearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link StearingType }
     *     
     */
    public void setStearing(StearingType value) {
        this.stearing = value;
    }

}
