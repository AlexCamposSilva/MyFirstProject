package com.CamposAlex.MyFirstProject;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CamposAlex.MyFirstProject.entities.Category;
import com.CamposAlex.MyFirstProject.entities.Product;
import com.CamposAlex.MyFirstProject.repository.CategoryRepository;
import com.CamposAlex.MyFirstProject.repository.ProductRepository;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner  {

	@Autowired
	private CategoryRepository categoryRepository;
	
		
	@Autowired
	private ProductRepository productRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Decoração", null);
		Category cat2 = new Category(null, "Eletro Eletronico", null);
		Category cat3 = new Category(null, "Limpeza", null);
				
		Product p1 = new Product(null, "Quadro", 200.0, cat1);
		Product p2 = new Product(null, "TV", 2500.0, cat2);
		Product p3 = new Product(null, "Vaso ", 150.0, cat1);
		Product p4 = new Product(null, "Phone", 2000.0, cat2);
		Product p5 = new Product(null, "Vassoura", 10.0, cat3);
		
		/* CASO QUEIRA ADICIONAR MANUALMENTE A CATEGORIA AO PRODUTO
		cat1.getProducts().addAll(Arrays.asList(p1,p3));
		cat2.getProducts().addAll(Arrays.asList(p2,p4));
		*/
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		

		
		
	}



}
