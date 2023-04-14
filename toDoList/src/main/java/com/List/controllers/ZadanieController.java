package com.List.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import com.List.services.ZadanieService;
import com.List.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.List.models.Zadanie;


@RestController
@RequestMapping("/task")
public class ZadanieController {
    @Autowired
    private UserService userService;
    @Autowired
    private ZadanieService zadanieService;

    @GetMapping("/{id}")
    public ResponseEntity<Zadanie> getTaskById(@PathVariable Integer id){
        try{
            Zadanie zadanie = zadanieService.getTaskById(id);
            return new ResponseEntity<Zadanie>(zadanie, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<Zadanie>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value="")
    public List<Zadanie> getAllTasks() {
        return zadanieService.getAllTasks();
    }
    
}
