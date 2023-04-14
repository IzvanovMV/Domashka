package com.Blog.Services;

import java.util.List;

import com.Blog.Repositories.URepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog.Models.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private URepository uRepository;
    public List<User> getAllUsers(){
        return uRepository.findAll();
    }
    public List<User> getUserByImya(String imya){
        return uRepository.findByImya(imya);
    }
    public void saveUser(User user){
        uRepository.save(user);
    }
    public void deleteUser(Integer id){
        uRepository.deleteById(id);
    }
    public User getUserById(Integer id){ return uRepository.findById(id).get();
    }
}
