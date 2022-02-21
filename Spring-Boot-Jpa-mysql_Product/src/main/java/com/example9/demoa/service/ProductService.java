package com.example9.demoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example9.demoa.model.Product;
import com.example9.demoa.repo.IProductRepository;
import com.example9.demoa.repo.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	IProductRepository iProdRepo;
	
	public void addProduct(Product pd)
	{
		iProdRepo.save(pd);
	}
	
	public List<Product> getAllProducts(){
		return (List<Product>) iProdRepo.findAll();
	}
	
	public Product findById(long id) {
		// TODO Auto-generated method stub
		return iProdRepo.findById(id).get();
		//return null;
	}
	
	public Product getProducts(int pid) {
		return productRepo.getProducts(pid);
	}
	public void deleteById(long id) {
		iProdRepo.deleteById(id);
	}
	
	public Product update(Product product, long l) {
		// TODO Auto-generated method stub
		return iProdRepo.save(product);
	}

	public String met1() {
		return "This ia service page";
	}

	
}
