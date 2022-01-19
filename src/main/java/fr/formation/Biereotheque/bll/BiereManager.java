package fr.formation.Biereotheque.bll;

import java.util.List;

import fr.formation.Biereotheque.bo.Biere;

public interface BiereManager {
	public void addBiere(Biere biere) throws BiereException;
	public List<Biere> getAll();
}
