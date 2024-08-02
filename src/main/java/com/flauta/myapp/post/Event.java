package com.flauta.myapp.post;

import com.flauta.myapp.coordinate.Coordinate;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("1")
public class Event extends Publication {
    private LocalDateTime date;
    private Coordinate location;

    private String classroom;


}
