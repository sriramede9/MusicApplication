package com.music.dao;

import java.util.ArrayList;

import java.util.List;

import com.music.model.Productone;

public class ProductDao {

	private List<Productone> productList;

	public List<Productone> getProductList() {
		Productone pone = new Productone();
		pone.setProductName("Guitar");
		pone.setProductCondition("Used");
		pone.setProductManufacturer("Yamaha");
		pone.setProductCategory("Instruments");
		pone.setProductStatus("available");
		pone.setUnitsInStock(2);
		pone.setProductPrice(200);
		pone.setProductDescription("Decoy Used by marron 5 band");

		Productone pon = new Productone();
		pon.setProductName("Keyboard");
		pon.setProductCondition("New");
		pon.setProductManufacturer("Yamaha");
		pon.setProductCategory("Instruments");
		pon.setProductStatus("available");
		pon.setUnitsInStock(5);
		pon.setProductPrice(800);
		pon.setProductDescription("Decoy Used by salena");

		productList = new ArrayList();
		productList.add(pone);
		productList.add(pon);
		return productList;
	}

}
