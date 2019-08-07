package com.rpsoft.unmarshal.object.without.root.annotation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for createSubscriber complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="createSubscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriber" type="{http://tecnomen.com/m2m}subscriber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSubscriber", propOrder = { "subscriber" })
public class CreateSubscriber {

	protected String subscriber;

	/**
	 * Gets the value of the subscriber property.
	 * 
	 * @return possible object is {@link Subscriber }
	 * 
	 */
	public String getSubscriber() {
		return subscriber;
	}

	/**
	 * Sets the value of the subscriber property.
	 * 
	 * @param value
	 *            allowed object is {@link Subscriber }
	 * 
	 */
	public void setSubscriber(String value) {
		this.subscriber = value;
	}

}
