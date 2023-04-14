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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nazvanie;
    private String DataSozdan;
    private String DataObnov;

    @ManyToOne
    @JoinColumn(name="id", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    private Zadanie category;

}
