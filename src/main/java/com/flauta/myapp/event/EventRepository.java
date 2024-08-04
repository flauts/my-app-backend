package com.flauta.myapp.event;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

public interface EventRepository extends JpaRepository<Event, Long> {

    Slice<Event> findByEndTimeAfterAndDate(LocalTime endTime, LocalDate date, Pageable pageable);

    @Query("from Event")
    Slice<Event> findByDate(LocalDate date, Pageable pageable);


}
