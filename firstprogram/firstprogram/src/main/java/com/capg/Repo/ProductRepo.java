package com.capg.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.Bean.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer>{

}
