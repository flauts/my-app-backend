package com.flauta.myapp.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PublicationRepository extends JpaRepository<Publication, Long> {
    @Query("from Publication")
    List<Publication> findAll();

    @Query("from Publication")
    Page<Publication> findAll(Pageable pageable);
}
