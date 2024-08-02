package com.flauta.myapp.chat;

import com.flauta.myapp.user.User;
import jakarta.persistence.*;

@Entity
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "sender_id",
            referencedColumnName = "user_id"
    )
    private User sender;


}
