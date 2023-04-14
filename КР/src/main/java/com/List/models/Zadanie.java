package com.List.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="task")
public class Zadanie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nazvanie;
    private String opisanie;
    private boolean sdelano;
    private String category;
    private String user;
    private String DataSozdan;
    private String DataObnov;

    @ManyToOne
    @JoinColumn(name="user", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    private User familia;
    
}
