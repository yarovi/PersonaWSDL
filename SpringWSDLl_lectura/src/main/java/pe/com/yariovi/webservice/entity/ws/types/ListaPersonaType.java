
package pe.com.yariovi.webservice.entity.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaPersonaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPersonaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="persona" type="{http://webservice.yariovi.com.pe/entity/ws/types}PersonaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPersonaType", propOrder = {
    "persona"
})
public class ListaPersonaType {

    @XmlElement(required = true)
    protected PersonaType persona;

    /**
     * Gets the value of the persona property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaType }
     *     
     */
    public PersonaType getPersona() {
        return persona;
    }

    /**
     * Sets the value of the persona property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaType }
     *     
     */
    public void setPersona(PersonaType value) {
        this.persona = value;
    }

}
