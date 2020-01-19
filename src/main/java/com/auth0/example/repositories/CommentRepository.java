package com.auth0.example.repositories;

import com.auth0.example.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
    Comment findOne(Integer id);
}

