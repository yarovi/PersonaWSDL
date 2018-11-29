package ynamsay.com.app;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import pe.com.yariovi.webservice.ws.impl.PersonaWSImpl;


@SpringBootApplication
//@ImportResource("classpath:META-INF/cxf/cxf.xml")
public class SpringWsdLlLecturaApplication 
extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringWsdLlLecturaApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringWsdLlLecturaApplication.class);
	}
	@Bean
	public ServletRegistrationBean servletSoap() {
		ServletRegistrationBean servletSoap = new ServletRegistrationBean(new CXFServlet(), "/ws/*");
		servletSoap.setLoadOnStartup(1);
		return servletSoap;
	}
	@Bean(name = Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl cxfEndpoint = new EndpointImpl(springBus(), new PersonaWSImpl());
		cxfEndpoint.publish("/service11");		
		return cxfEndpoint;
	}
}
