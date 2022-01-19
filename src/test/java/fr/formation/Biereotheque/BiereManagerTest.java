package fr.formation.Biereotheque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.formation.Biereotheque.bll.BiereException;
import fr.formation.Biereotheque.bll.BiereManager;
import fr.formation.Biereotheque.bo.Biere;

@SpringBootTest
class BiereManagerTest {
	@Autowired
	BiereManager biereManager;
	
	@Test
	@Transactional
	void addBiereTest() throws BiereException {
		int nb = biereManager.getAll().size();
		biereManager.addBiere(new Biere("Trompe Souris","Blonde",""));
		assertEquals(biereManager.getAll().size(), nb+1);
	}

	@Test
	@Transactional
	void addBiereKroTest() {
		assertThrows(BiereException.class, ()->{
			biereManager.addBiere(new Biere("Kro","Blonde",""));
		});
	}
	

	@Test
	@Transactional
	void getAllTest() throws BiereException {
		biereManager.addBiere(new Biere("Trompe Souris","Blonde",""));
		assertNotEquals(biereManager.getAll().size(), 0);
	}
	
	
	

}
