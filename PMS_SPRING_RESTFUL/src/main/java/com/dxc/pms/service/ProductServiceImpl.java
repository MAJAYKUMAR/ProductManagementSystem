package com.dxc.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.pms.entity.Product;
import com.dxc.pms.repository.IProductRepository;


@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository repo;
	
	@Autowired
	Product emptyProduct;
	
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public Product getProduct(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid).orElse(emptyProduct);
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		 repo.deleteById(pid);
		 
		
		 
		 
	}

	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
		
	
	
	
	

}
