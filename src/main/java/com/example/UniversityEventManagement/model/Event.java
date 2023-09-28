package com.example.UniversityEventManagement.model;

import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Event {
   @Id
    private Long eventId;
    private String eventName;
    private String eventLocation;
    private LocalDate eventDate;
    private LocalTime eventStartTime;
    private LocalTime eventEndTime;

}
