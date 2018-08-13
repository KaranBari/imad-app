package com.capg.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Bean.Product;
import com.capg.Service.ProductService;

@RestController
public class ProductController {

	@Autowired 
	ProductService service;
	@RequestMapping("/getproducts")
	public Optional<Product> getProductById(@RequestParam String id)
	{
		return service.getProductById(Integer.parseInt(id));
	}
}
