package pe.yarovi.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.yarovi.webservice.entity.Persona;
@Repository
public interface PersonaDAO extends JpaRepository<Persona,Integer> {

}
