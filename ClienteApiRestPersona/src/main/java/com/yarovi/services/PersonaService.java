package com.yarovi.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yarovi.repository.PersonaDAO;
import com.yarovi.webservice.entity.*;

import com.yarovi.webservice.entity.ws.types.BuscarRequest;
import com.yarovi.webservice.entity.ws.types.BuscarResponse;
import com.yarovi.webservice.entity.ws.types.ListaPersonaType;
import com.yarovi.webservice.entity.ws.types.PersonaType;
import com.yarovi.webservice.services.personaws.ws.PersonaWS;


@Service
public class PersonaService {

	private static final Logger logger = Logger.getLogger(PersonaService.class.getName());
	@Autowired
	private PersonaDAO personadao;
	
	@Autowired
	private  PersonaWS personaWSPorType;
	
	
	public List<Persona> getAll(){
		return personadao.findAll();
	}
	
	public List<Persona>  getAll2(){

		//ListaPersonaType listapersona= personaWSPorType.buscarDatos(null).getListaPersona();
		BuscarRequest request= new BuscarRequest();
		
		BuscarResponse repuesta= personaWSPorType.buscarDatos(request);
		
		List<Persona> lstPersona = new ArrayList<>();
		for (PersonaType p : repuesta.getListaPersona().getPersona()) {
			Persona nuevo = new Persona();
			nuevo.setNombre(p.getNombre());
			nuevo.setEdad(p.getEdad());
			nuevo.setDireccion(p.getDireccion());
			nuevo.setId(p.getId());
			lstPersona.add(nuevo);
		}
		logger.info("valor es : "+ repuesta.getListaPersona().getPersona().size());
		return lstPersona;
	}

}
