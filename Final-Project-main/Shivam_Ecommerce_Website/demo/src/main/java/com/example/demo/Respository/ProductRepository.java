package com.example.demo.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Category;
import com.example.demo.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    List<Product> findAllByCategory_Id(int id);
}
