package com.flauta.myapp.post;

import com.flauta.myapp.coordinate.Coordinate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "publication_type", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Publication {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long publication_id;
    @Size(min = 2, max = 50)
    private String title;
    @Size(min = 2, max = 1000)
    private String content;

    @URL
    private String form;

    @PositiveOrZero
    private Integer likes = 0;

    private LocalDateTime creationDate = LocalDateTime.now();


}