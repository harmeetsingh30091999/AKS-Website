package com.aks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AKSproducts {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String productname;
	private String productCode;
	private String productType;
	private String brand;
	private String sizing;
	private String bodyfeatures;
	private String bodymaterial;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getSizing() {
		return sizing;
	}
	public void setSizing(String sizing) {
		this.sizing = sizing;
	}
	public String getBodyfeatures() {
		return bodyfeatures;
	}
	public void setBodyfeatures(String bodyfeatures) {
		this.bodyfeatures = bodyfeatures;
	}
	public String getBodymaterial() {
		return bodymaterial;
	}
	public void setBodymaterial(String bodymaterial) {
		this.bodymaterial = bodymaterial;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public AKSproducts(int id, String productname, String productCode, String productType, String brand, String sizing,
			String bodyfeatures, String bodymaterial, String color) {
		super();
		this.id = id;
		this.productname = productname;
		this.productCode = productCode;
		this.productType = productType;
		this.brand = brand;
		this.sizing = sizing;
		this.bodyfeatures = bodyfeatures;
		this.bodymaterial = bodymaterial;
		this.color = color;
	}
	public AKSproducts() {
	
		System.out.println("product class called");
	}
	
	
	
	
}
