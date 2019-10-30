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

		productList = new ArrayList();
		productList.add(pone);
		return productList;
	}

}
