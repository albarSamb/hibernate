package projetnew;
// Generated 10 f�vr. 2025, 14:52:05 by Hibernate Tools 5.4.33.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Classe generated by hbm2java
 */
public class Classe implements java.io.Serializable {

	private int idclasse;
	private String code;
	private String nom;
	private String niveau;
	private Set enseignants = new HashSet(0);
	private Set etudiants = new HashSet(0);
	private Set courses = new HashSet(0);

	public Classe() {
	}

	public Classe(int idclasse, String code, String nom, String niveau) {
		this.idclasse = idclasse;
		this.code = code;
		this.nom = nom;
		this.niveau = niveau;
	}

	public Classe(int idclasse, String code, String nom, String niveau, Set enseignants, Set etudiants, Set courses) {
		this.idclasse = idclasse;
		this.code = code;
		this.nom = nom;
		this.niveau = niveau;
		this.enseignants = enseignants;
		this.etudiants = etudiants;
		this.courses = courses;
	}

	public int getIdclasse() {
		return this.idclasse;
	}

	public void setIdclasse(int idclasse) {
		this.idclasse = idclasse;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNiveau() {
		return this.niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public Set getEnseignants() {
		return this.enseignants;
	}

	public void setEnseignants(Set enseignants) {
		this.enseignants = enseignants;
	}

	public Set getEtudiants() {
		return this.etudiants;
	}

	public void setEtudiants(Set etudiants) {
		this.etudiants = etudiants;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}
