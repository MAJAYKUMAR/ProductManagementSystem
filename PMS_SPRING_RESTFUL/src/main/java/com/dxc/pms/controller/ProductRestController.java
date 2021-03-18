package com.dxc.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.pms.entity.Product;
import com.dxc.pms.service.IProductService;

@RestController
@RequestMapping(path="/pms")
public class ProductRestController {

	@Autowired
	Product product;

	@Autowired
	IProductService service;
	
	
	/*
	 * @GetMapping("/response") public ResponseEntity<String> getResponse() {
	 * 
	 * return new ResponseEntity<String>("Payment Received", HttpStatus.OK);
	 * 
	 * }
	 */
	@GetMapping(path = "/get/{id}", produces = { "application/json","application/xml"})
	public Product get(@PathVariable("id")  int pid) {

		
						
		
		return service.getProduct(pid);
		
	

	}
	
	
	@GetMapping(path="/products")
	public List<Product>  getAllProduct(){
		
		return service.getAllProduct();
		
		
	}
	
	
	

	@PostMapping(path = "/add", consumes = { "application/xml", "application/json" }, produces = { "application/xml","application/json" })
	public Product add(@RequestBody Product product) {

	

		return service.addProduct(product);

	}

	@PutMapping(path = "/update", consumes = { "application/xml", "application/json" }, produces = { "application/xml","application/json" })
	public Product update(@RequestBody Product product) {

	

		return service.updateProduct(product);

	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int pid) {

		// System.out.println(product);
		
		service.deleteProduct(pid);

		return "Product deleted with id  " + pid;

	}
	
	

}
