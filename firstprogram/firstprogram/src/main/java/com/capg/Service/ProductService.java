package com.capg.Service;

import java.util.Optional;

import com.capg.Bean.Product;

public interface ProductService {
public Optional<Product> getProductById(int id);
}
