
package com.rpsoft.helloworld.xsd.defininingdefaults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rpsoft.helloworld.xsd.defininingdefaults package. 
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

    private final static QName _Person_QNAME = new QName("http://rpsoft.com/helloworld/xsd/defininingdefaults/", "Person");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rpsoft.helloworld.xsd.defininingdefaults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonBean }
     * 
     */
    public PersonBean createPersonBean() {
        return new PersonBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rpsoft.com/helloworld/xsd/defininingdefaults/", name = "Person")
    public JAXBElement<PersonBean> createPerson(PersonBean value) {
        return new JAXBElement<PersonBean>(_Person_QNAME, PersonBean.class, null, value);
    }

}
