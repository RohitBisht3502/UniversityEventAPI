package com.example.UniversityEventManagement.repo;

import com.example.UniversityEventManagement.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepo extends CrudRepository<Event,Long> {


    List<Event> findByEventDate(LocalDate date);
}
