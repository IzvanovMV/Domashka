package com.Blog.Models;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

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
    private String dataRozhd;
    private String dataSozdan;
    private String dataObnov;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Post> posts;

    public void updateClient(User user){
        if(user.login != null){
            this.login = user.login;}
        if(user.familia != null){
            this.familia = user.familia;}
        if(user.imya != null){
            this.imya = user.imya;}
        if(user.otchestvo != null){
            this.otchestvo = user.otchestvo;}
        if(user.dataRozhd != null){
            this.dataRozhd = user.dataRozhd;}
        if(user.dataSozdan != null){
            this.dataSozdan = user.dataSozdan;}
        if(user.dataObnov != null){
            this.dataObnov = user.dataObnov;}
    }
}
