package com.xworkz.waterfall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="state")
public class StateEntity {
	
	@Id
	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="S_ID")
	private int sId;
	@Column(name="NAME")
	private String name;
	@Column(name="POPULATION")
	private double population;
	@Column(name="LANGUAGE")
	private String language;
	@Column(name="NO_OF_DISTRICTS")
	private int noOfDistricts;
	
	public StateEntity(String name, double population, String language, int noOfDistricts) {
		super();
		this.name = name;
		this.population = population;
		this.language = language;
		this.noOfDistricts = noOfDistricts;
	}
}
