package com.example9.contoller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example9.model.Product;
import com.example9.service.ProdService;
import com.example9.service.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProdService prodService;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello Susmitha "+prodService.met1();
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return prodService.getAllProducts();
	}
	
	@PostMapping("/addProduct")
	public Product createProduct(@RequestBody Product product) {
		return prodService.addProduct(product);
	}

	/*@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable int pid) {
		return prodService.getProduct(pid);
	}*/
	
	@GetMapping("/product/{pid}")
	public ResponseEntity <Product> getProduct(@PathVariable int pid) {
		Product prod = prodService.getProduct(pid);
		return new ResponseEntity<Product>(prod, HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/deleteProduct")
	public Product deleteProduct(@RequestParam int pid) {
		return prodService.deleteProduct(pid);
	}
}
