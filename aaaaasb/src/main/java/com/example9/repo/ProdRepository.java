package com.example9.repo;

import java.util.List;



import com.example9.model.Product;

public interface ProdRepository {
	
	public Product addProduct(Product pd);
	public List<Product> getProducts();
	public Product getProduct(int pid);
	public Product deleteProduct(int pid);
}
