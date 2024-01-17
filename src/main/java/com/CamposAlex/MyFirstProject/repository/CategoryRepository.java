package com.CamposAlex.MyFirstProject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CamposAlex.MyFirstProject.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
