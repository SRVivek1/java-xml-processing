
package com.rpsoft.xsdwithdefininginheritance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rpsoft.xsdwithdefininginheritance package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeBean_QNAME = new QName("http://rpsoft.com/XsdWithDefiningInheritance", "employeeBean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rpsoft.xsdwithdefininginheritance
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Emploee }
     * 
     */
    public Emploee createEmploee() {
        return new Emploee();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Emploee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rpsoft.com/XsdWithDefiningInheritance", name = "employeeBean")
    public JAXBElement<Emploee> createEmployeeBean(Emploee value) {
        return new JAXBElement<Emploee>(_EmployeeBean_QNAME, Emploee.class, null, value);
    }

}
