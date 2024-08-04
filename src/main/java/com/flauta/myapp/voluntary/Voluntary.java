package com.flauta.myapp.voluntary;

import com.flauta.myapp.coordinate.Coordinate;
import com.flauta.myapp.post.Publication;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("2")
public class Voluntary extends Publication {
    private Coordinate location;
    private LocalDateTime endRegistration;
    private LocalDateTime startRegistration;

    private LocalDateTime startDate;
    private LocalDateTime endDate;


}
