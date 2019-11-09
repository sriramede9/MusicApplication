package com.music.dao;

import java.io.IOException;
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
		pone.setProductId(1);

		Productone pon = new Productone();
		pon.setProductName("Keyboard");
		pon.setProductCondition("New");
		pon.setProductManufacturer("Yamaha");
		pon.setProductCategory("Instruments");
		pon.setProductStatus("available");
		pon.setUnitsInStock(5);
		pon.setProductPrice(800);
		pon.setProductDescription("Decoy Used by salena");
		pon.setProductId(2);

		productList = new ArrayList();
		productList.add(pone);
		productList.add(pon);
		return productList;
	}

	public Productone getProductById(int productId) throws IOException {
		// TODO Auto-generated method stub
		for (Productone p : getProductList()) {

			if (p.getProductId() == productId) {
				return p;
			}

		}
		throw new IOException("No such Product available");
	}

}
