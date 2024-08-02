package com.flauta.myapp.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface EventRepository extends JpaRepository<Event, Long> {
    @Query("from Event")
    Set<Event> findByDate();
}
