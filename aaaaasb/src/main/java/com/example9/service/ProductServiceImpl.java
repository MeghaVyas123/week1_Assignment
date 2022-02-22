package com.example9.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example9.model.Product;
import com.example9.repo.ProdRepository;

@Component
public class ProductServiceImpl implements ProdService{
	
	@Autowired
	ProdRepository productRepo;
	
	public Product addProduct(Product pd){
		return productRepo.addProduct(pd);
	}
	
	public List<Product> getAllProducts(){
		return productRepo.getProducts();
	}
	
	public Product getProduct(int pid) {
		return productRepo.getProduct(pid);
	}
	
	public Product deleteProduct(int pid) {
		return productRepo.deleteProduct(pid);
	}
	public String met1() {
		return "This message is from service";
	}

}
