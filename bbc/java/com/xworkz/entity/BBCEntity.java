package com.xworkz.entity;

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
@Table(name="bbc")
public class BBCEntity {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="WID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="GENDER")
	private String gender;
	@Column(name="DAYS_IN")
	private int daysIn;
	@Column(name="NO_OF_SEASON")
	private int noOfSeason;
	@Column(name="TYPE_OF_CONTESTANT")
	private String typeOfContestant;
	@Column(name="NO_OF_TASKS")
	private int noOfTasks;
	

}
