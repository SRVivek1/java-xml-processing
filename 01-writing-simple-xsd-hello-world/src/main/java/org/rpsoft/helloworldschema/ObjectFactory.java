
package org.rpsoft.helloworldschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.rpsoft.helloworldschema package. 
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

    private final static QName _PersonBean_QNAME = new QName("http://rpsoft.org/HelloWorldSchema", "personBean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.rpsoft.helloworldschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rpsoft.org/HelloWorldSchema", name = "personBean")
    public JAXBElement<Person> createPersonBean(Person value) {
        return new JAXBElement<Person>(_PersonBean_QNAME, Person.class, null, value);
    }

}
