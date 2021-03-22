package com.xworkz.vendor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="vendor")
@NamedQueries({@NamedQuery(name="getAll",query="select ven from VendorEntity ven"),
	@NamedQuery(name="deleteById",query="Delete VendorEntity ven where ven.id=:id"),
	@NamedQuery(name="findByName",query="SELECT ven from VendorEntity ven where ven.name=:nm ")})
public class VendorEntity {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="PRICE")
	private double price;
}
