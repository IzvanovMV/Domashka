package com.List.services;

import java.util.List;

import com.List.repositories.ZadanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.List.models.Zadanie;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ZadanieService {
    @Autowired
    private ZadanieRepository zadanieRepository;

    public List<Zadanie> getAllTasks(){
        return zadanieRepository.findAll();
    }

    public Zadanie getTaskById(Integer id){
        return zadanieRepository.findById(id).get();
    }

    public void save(Zadanie zadanie){
        zadanieRepository.save(zadanie);
    }

    public void delete(Integer id){
        zadanieRepository.deleteById(id);
    }
}
