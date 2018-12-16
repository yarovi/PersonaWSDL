package pe.yarovi.webservice.services;

import java.util.List;

import com.yarovi.webservice.entity.Persona;
public interface IPersonaService {

	List<Persona> find(Integer id);
}
