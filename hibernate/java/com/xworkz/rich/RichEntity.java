package com.xworkz.rich;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "rich_person")
public class RichEntity {

	@Id
	@Column(name = "RICH_ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "NET_WORTH_IN_BILLION")
	private int netWorthInBillions;
	@Column(name = "BUSINESS")
	private String business;
	@Column(name = "RANK_VALUE")
	private int rank;
	@Column(name="MARRIED")
	private boolean married;

}
