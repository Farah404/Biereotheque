package fr.formation.Biereotheque.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Brasserie {
	@Id
	@GeneratedValue
	private Integer idBrasserie;
	private String nom;
	private String adresse;
	
	public Brasserie(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
}
