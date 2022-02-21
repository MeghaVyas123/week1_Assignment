package com.example9.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.example9.demoa.model.Product;
import com.example9.demoa.service.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	private ProductService myService;
	
	@GetMapping("/hello")
	public String met() {
		return "Hello World example, ";
	}

	/*@GetMapping("/products/{pid}") // path vairiable
	public Product getProducts(@PathVariable int pid) {
		return myService.getProducts(pid);
	}*/
	
	@PostMapping(value="/addProduct" ,headers="Accept=application/json")
	public ResponseEntity<Void> createProduct(@RequestBody Product product, UriComponentsBuilder ucBuilder)
	{
		 System.out.println("Creating User "+product.getId());
		 myService.addProduct(product);
	     HttpHeaders headers = new HttpHeaders();
	     headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(product.getId()).toUri());
	     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	 
	 @GetMapping(value="/product", headers="Accept=application/json")
	 public List<Product> getAllUser() {	 
	  List<Product> tasks = myService.getAllProducts();
	  return tasks;
	
	 }
	
	@DeleteMapping(value="/{id}", headers ="Accept=application/json")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") long id){
		Product product = myService.findById(id);
		if (product == null) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		myService.deleteById(id);
		return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
	}
	
	
	@PutMapping(value="/update", headers="Accept=application/json")
	public ResponseEntity<String> updateProduct(@RequestBody Product currProduct)
	{
		System.out.println("sd");
		Product product = myService.findById(currProduct.getId());
	if (product==null) {
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	myService.update(currProduct, currProduct.getId());
	return new ResponseEntity<String>(HttpStatus.OK);
	}	
		
	
}