package com.example9.demoa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example9.demoa.model.Product;
public interface IProductRepository extends CrudRepository<Product, Long>
{
	//List<User> findByNameAndCountry(String name, String country);

}
