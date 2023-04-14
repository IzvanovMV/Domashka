package com.Blog.Repositories;
import com.Blog.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CatRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findById(Integer id);
}

