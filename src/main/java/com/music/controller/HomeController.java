package com.music.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.dao.ProductDao;
import com.music.model.Productone;

@Controller
public class HomeController {

	ProductDao pdao = new ProductDao();

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

		List<Productone> productList = pdao.getProductList();

		model.addAttribute("pl", productList);

		productList.get(0);

		return "productList";
	}
}
