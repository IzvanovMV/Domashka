package com.Blog.Services;

import java.util.List;

import com.Blog.Repositories.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Blog.Models.Post;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PostService {
    @Autowired
    private PRepository pRepository;
    public List<Post> getAllPosts(){
        return pRepository.findAll();
    }
    public Post getPostById(Integer id){
        return pRepository.findById(id).get();
    }
    public void save(Post post){
        pRepository.save(post);
    }
    public void delete(Integer id){
        pRepository.deleteById(id);
    }
}
