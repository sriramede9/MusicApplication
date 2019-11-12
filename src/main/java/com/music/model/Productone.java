package com.music.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Productone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	private String productName;

	private String productCategory;

	private int productPrice;

	private String productCondition;

	private String productStatus;

	private int unitsInStock;

	private String productManufacturer;

	private String productDescription;

	@Lob
	private byte[] file;

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public Productone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Productone(String productName, String productCategory, int productPrice, String productCondition,
			String productStatus, int unitsInStock, String productManufacturer, String productDescription) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productStatus = productStatus;
		this.unitsInStock = unitsInStock;
		this.productManufacturer = productManufacturer;
		this.productDescription = productDescription;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Productone(String productName, String productCategory, int productPrice, String productCondition,
			String productStatus, int unitsInStock, String productManufacturer) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productStatus = productStatus;
		this.unitsInStock = unitsInStock;
		this.productManufacturer = productManufacturer;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	@Override
	public String toString() {
		return "Productone [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", productCondition=" + productCondition
				+ ", productStatus=" + productStatus + ", unitsInStock=" + unitsInStock + ", productManufacturer="
				+ productManufacturer + ", productDescription=" + productDescription + ", file=" + Arrays.toString(file)
				+ "]";
	}

}
