package fr.formation.Biereotheque;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.formation.Biereotheque.bo.Biere;
import fr.formation.Biereotheque.dal.BiereDAO;

@SpringBootTest
class DALTest {
	@Autowired
	BiereDAO biereDAO;
	
	@Test
	@Transactional
	void insertTest() {
		int nb = (int) biereDAO.count();
		biereDAO.save(new Biere("Trompe Souris","Blonde",""));
		assertEquals((int)biereDAO.count(),nb+1);
	}

}
