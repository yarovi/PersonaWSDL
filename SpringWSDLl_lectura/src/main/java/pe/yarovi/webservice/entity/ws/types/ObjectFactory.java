
package pe.yarovi.webservice.entity.ws.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.yarovi.webservice.entity.ws.types package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.yarovi.webservice.entity.ws.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarRequest }
     * 
     */
    public BuscarRequest createBuscarRequest() {
        return new BuscarRequest();
    }

    /**
     * Create an instance of {@link BuscarResponse }
     * 
     */
    public BuscarResponse createBuscarResponse() {
        return new BuscarResponse();
    }

    /**
     * Create an instance of {@link ListaPersonaType }
     * 
     */
    public ListaPersonaType createListaPersonaType() {
        return new ListaPersonaType();
    }

    /**
     * Create an instance of {@link PersonaType }
     * 
     */
    public PersonaType createPersonaType() {
        return new PersonaType();
    }

}
