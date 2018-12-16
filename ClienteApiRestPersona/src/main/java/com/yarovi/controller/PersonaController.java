package com.yarovi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarovi.services.PersonaService;
import com.yarovi.webservice.entity.*;

@Controller
@RequestMapping("v1")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@RequestMapping(value="persona/all",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Persona>> getAll(){
		return new ResponseEntity<List<Persona>>(personaService.getAll(),HttpStatus.OK);
	}
	@RequestMapping(value="persona/allsoap",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Persona>> getAll2(){
		return new ResponseEntity<List<Persona>>(personaService.getAll2(),HttpStatus.OK);
	}
}
