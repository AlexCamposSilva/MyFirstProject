package com.CamposAlex.MyFirstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CamposAlex.MyFirstProject.entities.Category;
import com.CamposAlex.MyFirstProject.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
