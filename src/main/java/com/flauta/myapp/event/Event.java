package com.flauta.myapp.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.flauta.myapp.coordinate.Coordinate;
import com.flauta.myapp.post.Publication;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@DiscriminatorValue("1")
@Data
public class Event extends Publication {

    private LocalTime startTime;

    private LocalTime endTime;

    private LocalDate date;

    private Coordinate location;

    private String classroom;
}
