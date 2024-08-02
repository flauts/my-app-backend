package com.flauta.myapp.group;

import com.flauta.myapp.coordinate.Coordinate;
import com.flauta.myapp.user.User;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long group_id;

    private String name;
    private String description;
    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "group_members",
            joinColumns = @JoinColumn(
                    name = "group_id",
                    referencedColumnName = "group_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "user_id",
                    referencedColumnName = "user_id"
            )
    )
    private Set<User> members;

    @Embedded
    private Coordinate coordinate;
    //Posts
    //Events

}
