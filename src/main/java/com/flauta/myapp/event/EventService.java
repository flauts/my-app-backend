package com.flauta.myapp.event;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final ModelMapper modelMapper;


    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
        this.modelMapper = new ModelMapper();
    }


    public Slice<EventPreviewDto> getHappeningNowEvents(int page, int size) {
        LocalTime now = LocalTime.now();
        LocalDate today = LocalDate.now();

        Sort sortDateAscending = Sort.by("endTime").descending();
        Pageable pageable = PageRequest.of(page, size, sortDateAscending);

        Slice<Event> events = eventRepository.findByEndTimeAfterAndDate(now, today, pageable);
        return events.map(event -> modelMapper.map(event, EventPreviewDto.class));
    }

    public Event createEvent(EventDto event) {
        Event newEvent = modelMapper.map(event, Event.class);
        return eventRepository.save(newEvent);

    }

    public Slice<EventPreviewDto> getTodayEvents(int page, int size) {
        LocalDate today = LocalDate.now();
        Sort sortDateAscending = Sort.by("endTime").ascending();
        Pageable pageable = PageRequest.of(page, size, sortDateAscending);

        Slice<Event> events = eventRepository.findByDate(today, pageable);
        return events.map(event -> modelMapper.map(event, EventPreviewDto.class));
    }
}
