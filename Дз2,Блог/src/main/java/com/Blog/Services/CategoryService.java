package com.Blog.Services;

import java.util.List;

import com.Blog.Models.Category;
import com.Blog.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CatRepository catRepository;
    public List<Category> getAllCategories() {
        return catRepository.findAll();
    }
    public Category getCategoryById(Integer id) {
        return catRepository.findById(id).get();
    }
    public void save(Category category) {
        catRepository.save(category);
    }
    public void delete(Integer id) {
        catRepository.deleteById(id);
    }
}
