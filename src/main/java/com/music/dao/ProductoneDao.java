package com.music.dao;

import java.util.List;

import com.music.model.Productone;

public interface ProductoneDao {

	void addProduct(Productone pone);

	Productone getProductById(int id);

	List<Productone> getAllProducts();

	void deleteProductone(int id);
}
