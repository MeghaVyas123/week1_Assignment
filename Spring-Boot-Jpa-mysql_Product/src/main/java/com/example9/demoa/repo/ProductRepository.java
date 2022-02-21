package com.example9.demoa.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example9.demoa.model.Product;

@Repository
public class ProductRepository  {
	private ArrayList<Product> arr;
	
	public ProductRepository()
	{
		arr = new ArrayList<>();
	}
	
	public Product addProduct(Product pd) {
		arr.add(pd);
		return pd;
	}
	
	public List<Product> getProduct(){
		return arr;
	}
	
	public Product getProducts(int pid) {
		return arr.get(pid);
	}
}
