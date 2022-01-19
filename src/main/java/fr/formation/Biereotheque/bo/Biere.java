package fr.formation.Biereotheque.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Biere {
	@Id
	@GeneratedValue
	private Integer idBiere;
	private String nom;
	private String couleur;
	private String description;
	
	@ManyToOne
	private Brasserie brasserie;
	
	public Biere(String nom, String couleur, String description) {
		super();
		this.nom = nom;
		this.couleur = couleur;
		this.description = description;
	}
}
