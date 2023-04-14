package com.Blog.Controllers;

import java.util.List;
import java.util.NoSuchElementException;

import com.Blog.Models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Blog.Services.CategoryService;
import com.Blog.Services.PostService;


@RestController
@RequestMapping("/category")
public class CatController
{
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Integer id){
        try{
            Category category = categoryService.getCategoryById(id);
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping(value="")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

}
