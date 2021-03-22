package com.xworkz.person.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="person")
@NamedQueries({@NamedQuery(name="getAll",query="select per from PersonEntity per"),
	@NamedQuery(name="deleteById",query="Delete PersonEntity per where per.id=:id"),
	@NamedQuery(name="findByName",query="SELECT per from PersonEntity per where per.name=:nm ")})
public class PersonEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE_NO")
	private long phoneNo;
}
