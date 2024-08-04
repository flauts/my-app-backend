package com.flauta.myapp.voluntary;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface VoluntaryRepository extends JpaRepository<Voluntary, Long> {

}
