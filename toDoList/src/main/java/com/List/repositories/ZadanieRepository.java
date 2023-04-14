package com.List.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.List.models.Zadanie;

public interface ZadanieRepository extends JpaRepository<Zadanie, Integer>{
    List<Zadanie> findByUser(String user);
}
