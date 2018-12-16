package com;

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

import com.yarovi.webservice.entity.ws.Impl.PersonaWSImpl;




@SpringBootApplication
public class App extends SpringBootServletInitializer{

    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
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
