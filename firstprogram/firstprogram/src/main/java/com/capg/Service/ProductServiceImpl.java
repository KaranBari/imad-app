package com.capg.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Bean.Product;
import com.capg.Repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo repo;
	
	@Override
	public Optional<Product> getProductById(int id) {
		return repo.findById(id);
	}

}
	