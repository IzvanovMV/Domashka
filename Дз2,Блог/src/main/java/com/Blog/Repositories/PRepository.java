package com.Blog.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blog.Models.Post;

public interface PRepository extends JpaRepository<Post, Integer>{
    List<Post> findByUser(String user); }
