package com.dxc.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dxc.pms.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> { // JpaRepo extends CrudRepo

	

}
