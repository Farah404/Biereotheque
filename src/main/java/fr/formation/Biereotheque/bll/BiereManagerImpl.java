package fr.formation.Biereotheque.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.Biereotheque.bo.Biere;
import fr.formation.Biereotheque.dal.BiereDAO;

@Service
public class BiereManagerImpl implements BiereManager {
	@Autowired
	BiereDAO dao;
	
	@Override
	public void addBiere(Biere biere) throws BiereException {
		if("kro".equalsIgnoreCase(biere.getNom())){
			throw new BiereException("Pas de Kro");
		}
		dao.save(biere);
	}

	@Override
	public List<Biere> getAll() {
		return (List)dao.findAll();
	}

}
