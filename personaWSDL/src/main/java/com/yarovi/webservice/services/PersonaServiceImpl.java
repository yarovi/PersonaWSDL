package com.yarovi.webservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarovi.webservice.entity.Persona;
import com.yarovi.webservice.repository.PersonaDAO;


@Service
public class PersonaServiceImpl implements IPersonaService{

	
	@Autowired
	private PersonaDAO personaDao;

	@Override
	public List<Persona> find(Integer id) {
		// TODO Auto-generated method stub
		List<Persona> ltaPersona=null;		
		if(id!=null) {
			ltaPersona = new ArrayList<Persona>();
			/*
			 * In version 2.0.0. of spring-boot-starter-data-jpa, 
			after extends JpaRepository from Service Class, 
			I saw findOne method get error.
			 * 
			 * */
			ltaPersona.add(personaDao.findById(id).get());
			//ltaPersona.add(null);			
		}else {			
			ltaPersona=personaDao.findAll();
		}		
		return ltaPersona;
	}	
	
//	public List<Persona> find(Integer id) {
//		List<Persona> ltaPersona=null;		
//		if(id!=null) {
//			ltaPersona = new ArrayList<Persona>();
//			/*
//			 * In version 2.0.0. of spring-boot-starter-data-jpa, 
//			after extends JpaRepository from Service Class, 
//			I saw findOne method get error.
//			 * 
//			 * */
//			ltaPersona.add(personaDao.findById(id).get());
//			//ltaPersona.add(null);			
//		}else {			
//			ltaPersona=personaDao.findAll();
//		}		
//		return ltaPersona;
//	}

}
