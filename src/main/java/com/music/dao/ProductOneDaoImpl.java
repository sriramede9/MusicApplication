package com.music.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.music.model.Productone;

@Repository
@Transactional
public class ProductOneDaoImpl implements ProductoneDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void addProduct(Productone pone) {
		// TODO Auto-generated method stub
		 hibernateTemplate.saveOrUpdate(pone);

		System.out.println("added to the created database!" );
	}

	public Productone getProductById(int id) {
		// TODO Auto-generated method stub
		Productone pone = hibernateTemplate.load(Productone.class, id);
		return pone;
	}

	public List<Productone> getAllProducts() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Productone.class);
	}

	public void deleteProductone(int id) {
		// TODO Auto-generated method stub

		Productone pone = hibernateTemplate.load(Productone.class, id);
		hibernateTemplate.delete(pone);
	}

}
