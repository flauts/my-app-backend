package com.flauta.myapp.post;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class PublicationDto {
    private String title;
    private String description;
    private String form;
    //images
}
