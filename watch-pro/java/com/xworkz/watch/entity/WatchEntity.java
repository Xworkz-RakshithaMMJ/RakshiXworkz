package com.xworkz.watch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="watch")
public class WatchEntity {

	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Id
	@Column(name="W_ID")
	private int w_id;
	@Column(name="BRAND_NAME")
	private String brandName;
	@Column(name="COST")
	private double cost;
	@Column(name="RECEIPT_NO")
	private int receiptNo;
	@Column(name="WATCH_TYPE")
	private String watchType;
	
}
