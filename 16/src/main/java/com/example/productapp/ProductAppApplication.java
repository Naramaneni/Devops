package com.example.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
	}
}

@Controller
class ProductController {

	private static List<Product> productList = new ArrayList<>();

	static {
		productList.add(new Product("iPad", "$100", "Default"));
		productList.add(new Product("iPhone", "$150", "Default"));
		productList.add(new Product("iPod", "$50", "Default"));
	}

	@GetMapping(path = "/products")
	public String getProducts(Model model) {
		model.addAttribute("products", productList);
		return "products";
	}

	@GetMapping(path = "/logout")
	public String logout(HttpServletRequest request) throws ServletException {
		request.logout();
		return "/";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.GET)
	public String add(Model model) throws ServletException {
		model.addAttribute("product", new Product());
		return "addProduct";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("product") Product product) {

		if (null != product && null != product.getName() && null != product.getPrice() && !product.getName().isEmpty()
				&& !product.getPrice().isEmpty()) {

			synchronized (productList) {
				productList.add(product);
			}

		}

		return "redirect:/products";
	}
}
