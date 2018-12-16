package pe.yarovi.webservice.ws.Impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.BindingType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yarovi.webservice.entity.Persona;

import pe.yarovi.webservice.entity.ws.types.BuscarRequest;
import pe.yarovi.webservice.entity.ws.types.BuscarResponse;
import pe.yarovi.webservice.entity.ws.types.ListaPersonaType;
import pe.yarovi.webservice.entity.ws.types.PersonaType;
import pe.yarovi.webservice.services.IPersonaService;
import pe.yarovi.webservice.services.PersonaServiceImpl;
import pe.yarovi.webservice.services.personaws.ws.PersonaWS;

@WebService(
		serviceName = "personaWS", 
		targetNamespace = "http://webservice.yarovi.pe/services/personaws/ws", 
		portName = "personaWS", 
		endpointInterface = "pe.yarovi.webservice.services.personaws.ws.PersonaWS", 
		wsdlLocation = "META-INF/wsdl/personaWS.wsdl")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class PersonaWSImpl implements PersonaWS {

	
private static final Logger logger = Logger.getLogger(PersonaWSImpl.class.getName());
	
	@Resource
	private WebServiceContext context;
	
	@Override
	public BuscarResponse buscarDatos(BuscarRequest request) {
		logger.info("[buscarDatos] =========== INICIO ===========");
		BuscarResponse response = new BuscarResponse();
		try {
			ServletContext servletContext = (ServletContext) context.getMessageContext().get("javax.xml.ws.servlet.context");
			WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
			
			IPersonaService personaService =(PersonaServiceImpl) webApplicationContext.getAutowireCapableBeanFactory().getBean("personaServiceImpl");
			
			List<Persona> lta = personaService .find(request.getId());
			
			if(lta !=null && lta.size()>0) {
				ListaPersonaType ltaType= new ListaPersonaType();
				for(Persona p :lta) {
					PersonaType ptype = new PersonaType();
					ptype.setDireccion(p.getDireccion());
					ptype.setEdad(p.getEdad());
					ptype.setNombre(p.getNombre());
					
					ltaType.getPersona().add(ptype);
				}
				response.setListaPersona(ltaType);
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Exception: ", e);
		}
		return response;
	}

}

