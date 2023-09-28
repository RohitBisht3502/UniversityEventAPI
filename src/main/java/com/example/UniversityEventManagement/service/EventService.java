package com.example.UniversityEventManagement.service;

import com.example.UniversityEventManagement.model.Event;
import com.example.UniversityEventManagement.repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo eventRepo;

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepo.findAll();
    }

    public String createEvent(Event event) {
        eventRepo.save(event);
        return "Event Added sucessfully";
    }

    public String deleteEventById(Long id) {
        eventRepo.deleteById(id);
        return "Event Delete Sucessfully";
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return eventRepo.findByEventDate(date);
    }
}
