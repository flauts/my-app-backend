package com.flauta.myapp.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    @Query("from Publication")
    List<Publication> findAll();
}
