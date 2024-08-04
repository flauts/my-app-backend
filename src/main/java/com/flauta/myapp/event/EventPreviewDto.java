package com.flauta.myapp.event;

import com.flauta.myapp.coordinate.Coordinate;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventPreviewDto {
    private Long publication_id;
    private String title;
    private String description;
    private Integer likes;
    private LocalDateTime date;
    //images
}
