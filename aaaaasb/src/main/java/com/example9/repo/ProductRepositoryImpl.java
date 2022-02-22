package com.example9.repo;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.example9.model.Product;

@Repository
public class ProductRepositoryImpl implements ProdRepository{
	
	private ArrayList<Product> alp;
	public ProductRepositoryImpl() {
		alp = new ArrayList<>();
	}
	
	public Product addProduct(Product pd) {
		alp.add(pd);
		return pd;
	}
	
	public List<Product> getProducts(){
		return alp;
	}
	
	public Product getProduct(int pid) {
		return alp.get(pid);
	}

	public Product deleteProduct(int pid) {
		Product tprod = alp.get(pid);
		alp.remove(pid);
		return tprod;
		}
}
