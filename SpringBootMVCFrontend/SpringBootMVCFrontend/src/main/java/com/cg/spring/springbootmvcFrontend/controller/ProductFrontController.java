package com.cg.spring.springbootmvcFrontend.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.springbootmvcFrontend.bean.Product;

@RestController
public class ProductFrontController {
@RequestMapping("/products/{id}")
public Product getProduct(@PathVariable String id)
{
	RestTemplate rt= new RestTemplate();
Product p= rt.getForObject("http://localhost:9090/getproducts?id="+id,Product.class);
return p;
}
}
