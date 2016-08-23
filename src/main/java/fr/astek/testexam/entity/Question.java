package fr.astek.testexam.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="QUESTION")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="CHOIX")
	private ArrayList<String> choix;
	
	@Column(name="BONNESREPONSES")
	private ArrayList<String> bonnesResponses;
	
	@Column(name="DIFFICULTE")
	private Difficulte difficulte;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getChoix() {
		return choix;
	}

	public void setChoix(ArrayList<String> choix) {
		this.choix = choix;
	}

	public List<String> getBonnesResponses() {
		return bonnesResponses;
	}

	public void setBonnesResponses(ArrayList<String> bonnesResponses) {
		this.bonnesResponses = bonnesResponses;
	}

	public Difficulte getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(Difficulte difficulte) {
		this.difficulte = difficulte;
	}
	
	
}
