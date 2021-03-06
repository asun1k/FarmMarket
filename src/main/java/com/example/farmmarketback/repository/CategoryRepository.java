package com.example.farmmarketback.repository;

import com.example.farmmarketback.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findAll();
    List<Category> findAllByCategoryName(String categoryName);
}
