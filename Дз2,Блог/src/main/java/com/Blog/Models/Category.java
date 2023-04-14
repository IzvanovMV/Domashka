package com.Blog.Models;


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
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nazvanie;
    private String dataSozdan;
    private String dataObnov;

    @ManyToOne
    @JoinColumn(name="name", nullable = false, insertable = false, updatable = false)
    @JsonIgnore
    private Post category;

}
