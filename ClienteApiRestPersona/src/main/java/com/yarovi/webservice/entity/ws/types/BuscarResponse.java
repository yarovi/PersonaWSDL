
package com.yarovi.webservice.entity.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaPersona" type="{http://webservice.yarovi.com/entity/ws/types}listaPersonaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaPersona"
})
@XmlRootElement(name = "buscarResponse")
public class BuscarResponse {

    @XmlElement(required = true)
    protected ListaPersonaType listaPersona;

    /**
     * Gets the value of the listaPersona property.
     * 
     * @return
     *     possible object is
     *     {@link ListaPersonaType }
     *     
     */
    public ListaPersonaType getListaPersona() {
        return listaPersona;
    }

    /**
     * Sets the value of the listaPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPersonaType }
     *     
     */
    public void setListaPersona(ListaPersonaType value) {
        this.listaPersona = value;
    }

}
