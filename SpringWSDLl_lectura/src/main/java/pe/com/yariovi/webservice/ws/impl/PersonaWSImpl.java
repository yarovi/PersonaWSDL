package pe.com.yariovi.webservice.ws.impl;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.log4j.Logger;

import pe.com.yariovi.webservice.entity.ws.types.BuscarRequest;
import pe.com.yariovi.webservice.entity.ws.types.BuscarResponse;
import pe.com.yaroovi.webservice.services.personaws.ws.PersonaWS;


@WebService(
		serviceName = "personaWS", 
		targetNamespace = "http://webservice.yaroovi.com.pe/services/personaws/ws", 
		portName = "personaWS", /*PorType WSdL*/
		endpointInterface = "pe.com.yaroovi.webservice.services.personaws.ws.PersonaWS", /*nombre interfaz y paquete*/
		wsdlLocation = "META-INFO/wsdl/personaWS.wsdl")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class PersonaWSImpl implements PersonaWS {

	private static final Logger logger = Logger.getLogger(PersonaWSImpl.class.getName());
	@Override
	public BuscarResponse buscarDatos(BuscarRequest request) {
		// TODO Auto-generated method stub
		
		logger.info("Iniciando ...");
		return new BuscarResponse();
	}

}
