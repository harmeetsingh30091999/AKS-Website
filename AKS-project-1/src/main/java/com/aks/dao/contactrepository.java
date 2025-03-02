package com.aks.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aks.model.AKSContact;

public interface contactrepository extends JpaRepository<AKSContact, Integer>{

}
