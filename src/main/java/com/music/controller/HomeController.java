package com.music.controller;

import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.music.dao.ProductDao;
import com.music.dao.ProductoneDao;
import com.music.model.Productone;

@Controller
public class HomeController {

	ProductDao pdao = new ProductDao();

	@Autowired
	ProductoneDao productoneDao;

	// test-drive
	@RequestMapping("/good")
	public String testrun() {
		return "hello";
	}

	// home-page
	@GetMapping("/welcome")
	public String homePage() {
		return "welcome";
	}

	@GetMapping("/productlist")
	public String getProducts(Model model) {

		List<Productone> productList = productoneDao.getAllProducts();

		// Productone plone = productList.get(0);
		model.addAttribute("pl", productList);

		return "productList";
	}

	@GetMapping("/addProduct")
	public String addProduct(Model model) {
		Productone pobj = new Productone();
		model.addAttribute("productobj", pobj);
		return "addProduct3";
	}

	@PostMapping("/addproductformresponse")
	public String formresponse(@ModelAttribute("productobj") Productone pone) {

		System.out.println(pone);

		productoneDao.addProduct(pone);

		return "redirect:productlist";
	}

	@GetMapping("/viewProduct/{productId}")
	public String viewProduct(@PathVariable int productId, Model model) throws IOException {
		Productone productById = productoneDao.getProductById(productId);
		System.out.println(productById);
		 model.addAttribute("product",productById );
		return "view-product";
	}
	
	@RequestMapping(value = "/addproductformresponse2", method = RequestMethod.POST, consumes = {
			MediaType.MULTIPART_FORM_DATA_VALUE })
	public String addProdt(@ModelAttribute Productone p, BindingResult bindingResult, @RequestParam MultipartFile file)
			throws IOException {

		// bindingResult.

		// System.out.println(p);
		System.out.println(file.getBytes());

		p.setFile(file.getBytes());

		System.out.println(p);

		//imgdao.addStudentimg(p);
		
		productoneDao.addProduct(p);

		return "redirect:productlist";

	}

}
