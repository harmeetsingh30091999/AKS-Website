package com.aks.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aks.model.AKSproducts;

public interface productrespository extends JpaRepository<AKSproducts, Integer>{

	@Query("select u from AKSproducts u where u.productCode = :name")
	public AKSproducts getUserByName(@Param("name") String name);
	
}
