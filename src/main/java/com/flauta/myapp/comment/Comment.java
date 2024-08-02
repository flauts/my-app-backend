package com.flauta.myapp.comment;

import com.flauta.myapp.post.Publication;
import com.flauta.myapp.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long comment_id;

    @Size(min = 2, max = 240)
    private String content;

    @ManyToOne
    @JoinColumn(name = "publication_id")
    private Publication publication;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
