package com.yarovi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.yarovi.webservice.services.personaws.ws.PersonaWS;


@Configuration
public class WSConfig {

	@Value("${url.personaws.soap}")
	private String urlProductoSOAP;
	
	
	@Bean
	public JaxWsPortProxyFactoryBean proxyWSGesDoc() throws MalformedURLException {
		JaxWsPortProxyFactoryBean ret = new JaxWsPortProxyFactoryBean();
		ret.setServiceInterface(PersonaWS.class);
		ret.setWsdlDocumentUrl(new URL(urlProductoSOAP));
		ret.setNamespaceUri("http://webservice.yarovi.com/services/personaws/ws");
		ret.setServiceName("personaWS");
		ret.setEndpointAddress(urlProductoSOAP);
		ret.setLookupServiceOnStartup(false);
		//ret.setHandlerResolver(new HeaderHandlerResolver());

		Map<String, Object> jaxwsCustomProperties = new HashMap<String, Object>();
		jaxwsCustomProperties.put("com.sun.xml.ws.request.timeout", 5000);
		jaxwsCustomProperties.put("com.sun.xml.ws.connect.timeout", 5000);
		ret.setCustomProperties(jaxwsCustomProperties);
		return ret;
	}
}
