package com.flauta.myapp.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.flauta.myapp.coordinate.Coordinate;
import com.flauta.myapp.post.PublicationDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class EventDto extends PublicationDto {
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;
    private Coordinate location;
    private String classroom;

}
