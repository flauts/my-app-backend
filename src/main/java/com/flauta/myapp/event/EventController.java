package com.flauta.myapp.event;

import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;
    private final EventRepository eventRepository;

    public EventController(EventService eventService, EventRepository eventRepository) {
        this.eventService = eventService;
        this.eventRepository = eventRepository;
    }

    @GetMapping("/get/now")
    public ResponseEntity<Slice<EventPreviewDto>> getHappeningNowEvents(@RequestParam int page,
                                                                        @RequestParam(defaultValue = "2", required = false) int size) {
        return ResponseEntity.ok(eventService.getHappeningNowEvents(page, size));
    }

    @GetMapping("/get/today")
    public ResponseEntity<Slice<EventPreviewDto>> getTodayEvents(@RequestParam int page,
                                                                 @RequestParam(defaultValue = "2", required = false) int size) {
        return ResponseEntity.ok(eventService.getTodayEvents(page, size));
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(eventRepository.findAll());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/post")
    public ResponseEntity<Void> createEvent(@RequestBody EventDto newEvent) {
        Event savedEvent = eventService.createEvent(newEvent);
        URI location = URI.create("/api/events/" + savedEvent.getPublication_id());
        return ResponseEntity.created(location).build();
    }
}
