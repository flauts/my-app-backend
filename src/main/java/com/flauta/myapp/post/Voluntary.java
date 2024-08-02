package com.flauta.myapp.post;

import com.flauta.myapp.coordinate.Coordinate;
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
