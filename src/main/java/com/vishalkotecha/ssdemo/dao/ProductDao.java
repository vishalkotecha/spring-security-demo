package com.vishalkotecha.ssdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishalkotecha.ssdemo.model.Products;

/**
 * @author Vishal Kotecha
 */
public interface ProductDao extends JpaRepository<Products,Long> {
}
