package com.yarovi.webservice.services.personaws.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.16
 * 2018-12-14T07:25:01.018-05:00
 * Generated source version: 3.1.16
 * 
 */
@WebServiceClient(name = "personaWS", 
                  wsdlLocation = "file:/C:/Users/Yasmani/Documents/workspace/personaWSDL/src/main/resources/META-INF/wsdl/personaWS.wsdl",
                  targetNamespace = "http://webservice.yarovi.com/services/personaws/ws") 
public class PersonaWS_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.yarovi.com/services/personaws/ws", "personaWS");
    public final static QName PersonaWSDLSOAP = new QName("http://webservice.yarovi.com/services/personaws/ws", "personaWSDLSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Yasmani/Documents/workspace/personaWSDL/src/main/resources/META-INF/wsdl/personaWS.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonaWS_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Yasmani/Documents/workspace/personaWSDL/src/main/resources/META-INF/wsdl/personaWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonaWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonaWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonaWS_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PersonaWS_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PersonaWS_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PersonaWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PersonaWS
     */
    @WebEndpoint(name = "personaWSDLSOAP")
    public PersonaWS getPersonaWSDLSOAP() {
        return super.getPort(PersonaWSDLSOAP, PersonaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonaWS
     */
    @WebEndpoint(name = "personaWSDLSOAP")
    public PersonaWS getPersonaWSDLSOAP(WebServiceFeature... features) {
        return super.getPort(PersonaWSDLSOAP, PersonaWS.class, features);
    }

}