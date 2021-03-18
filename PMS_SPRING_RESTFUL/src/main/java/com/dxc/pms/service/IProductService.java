package com.dxc.pms.service;

import java.util.List;

import com.dxc.pms.entity.Product;

public interface IProductService {
	
	
	
	public Product  addProduct(Product product);
	
	
	public Product  updateProduct(Product product);
	
	
	public Product  getProduct(int pid);
	
	public void  deleteProduct(int pid);
	
	public List<Product>  getAllProduct();
	
	
	



	
	
}
