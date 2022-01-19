package fr.formation.Biereotheque.dal;

import org.springframework.data.repository.CrudRepository;

import fr.formation.Biereotheque.bo.Biere;

public interface BiereDAO extends CrudRepository<Biere, Integer>{

}
