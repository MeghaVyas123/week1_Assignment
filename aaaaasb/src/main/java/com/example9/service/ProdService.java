package com.example9.service;

import java.util.List;

import com.example9.model.Product;

public interface ProdService {
	public Product addProduct(Product pd);
	public List<Product> getAllProducts();
	public Product getProduct(int pid);
	public Product deleteProduct(int pid);
	public String met1();
	
}
