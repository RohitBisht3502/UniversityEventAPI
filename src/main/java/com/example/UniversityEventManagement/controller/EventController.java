package com.example.UniversityEventManagement.controller;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("Events")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("Events")
    public String createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @DeleteMapping("delete/event/id/{id}")
    public String deleteEventById(@PathVariable Long id){
        return eventService.deleteEventById(id);
    }

    @GetMapping("get/event/by/date/")
    public List<Event> getAllEventsByDate(@RequestParam LocalDate date) {
        return eventService.getAllEventsByDate(date);
    }



}
