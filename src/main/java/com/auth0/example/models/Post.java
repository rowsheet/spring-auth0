package com.auth0.example.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id") // comments.id
    @ElementCollection(targetClass = Comment.class)
    private List<Comment> comments = new ArrayList<Comment>();
}
