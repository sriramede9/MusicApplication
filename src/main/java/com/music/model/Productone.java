package com.music.model;

public class Productone {

	private String productName;

	private String productCategory;

	private int productPrice;

	private String productCondition;

	private String productStatus;

	private int unitsInStock;

	private String productManufacturer;

	private String productDescription;

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
		return "Productone [productName=" + productName + ", productCategory=" + productCategory + ", productPrice="
				+ productPrice + ", productCondition=" + productCondition + ", productStatus=" + productStatus
				+ ", unitsInStock=" + unitsInStock + ", productManufacturer=" + productManufacturer
				+ ", productDescription=" + productDescription + "]";
	}

}
