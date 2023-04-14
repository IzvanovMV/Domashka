package com.List.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.List.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    List<User> findByImya(String imya);
}
