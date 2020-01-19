package com.auth0.example.repositories;

import com.auth0.example.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Comment findOne(Integer id);
}

