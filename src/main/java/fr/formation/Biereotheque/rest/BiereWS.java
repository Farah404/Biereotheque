package fr.formation.Biereotheque.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.Biereotheque.bll.BiereException;
import fr.formation.Biereotheque.bll.BiereManager;
import fr.formation.Biereotheque.bo.Biere;

@RestController
public class BiereWS {
	@Autowired
	BiereManager biereManager;

	@GetMapping("/WS/populate")
	public void populate() throws BiereException {
		biereManager.addBiere(new Biere("Trompe Souris", "Blonde", ""));
	}

	@PostMapping("/WS/biere")
	public BiereDTO insert(@RequestBody BiereDTO biere) throws BiereException {
		Biere b = new Biere(biere.getName(),"",biere.getDesc());
		biereManager.addBiere(b);
		return biere;
	}

	@GetMapping("/WS/biere")
	public List<BiereDTO> getAll() {
		List<BiereDTO> result = new ArrayList<>();
		for(Biere b : biereManager.getAll()) {
			result.add(new BiereDTO(b.getNom(),b.getDescription()));
		}
		
		return result;
	}
}
