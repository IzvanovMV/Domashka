package com.Blog.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blog.Models.User;

public interface URepository extends JpaRepository<User, Integer> {
    List<User> findByImya(String imya); }
