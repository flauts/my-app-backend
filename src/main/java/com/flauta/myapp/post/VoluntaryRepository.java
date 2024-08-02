package com.flauta.myapp.post;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface VoluntaryRepository extends JpaRepository<Voluntary, Long> {

    Page<Voluntary> findByEndDateDayOfMonth(String location, int page, int size);
}
