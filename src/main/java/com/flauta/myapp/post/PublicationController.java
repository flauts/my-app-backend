package com.flauta.myapp.post;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicationController {

    private final PublicationService publicationService;

    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }


}
