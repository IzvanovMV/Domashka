package com.List.models;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String familia;
    private String imya;
    private String otchestvo;
    private String denRozh;
    private String dataSozdan;
    private String dataObnov;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Zadanie> zadanies;

    public void updateClient(User user){
        if(user.login != null){
            this.login = user.login;
        }
        if(user.familia != null){
            this.familia = user.familia;
        }
        if(user.imya != null){
            this.imya = user.imya;
        }
        if(user.otchestvo != null){
            this.otchestvo = user.otchestvo;
        }
        if(user.denRozh != null){
            this.denRozh = user.denRozh;
        }
        if(user.dataSozdan != null){
            this.dataSozdan = user.dataSozdan;
        }
        if(user.dataObnov != null){
            this.dataObnov = user.dataObnov;
        }
    }
}
