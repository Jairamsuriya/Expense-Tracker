package com.example.jrs.Controller;

import com.example.jrs.Model.CalendarEvent;
import com.example.jrs.Service.CalendarEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calendar")
public class CalendarController {

    private final CalendarEventService calendarEventService;

    @Autowired
    public CalendarController(CalendarEventService calendarEventService) {
        this.calendarEventService = calendarEventService;
    }

    @PostMapping("/events")
    public CalendarEvent addEvent(@RequestBody CalendarEvent calendarEvent) {
        return calendarEventService.addEvent(calendarEvent);
    }

    @GetMapping("/events")
    public List<CalendarEvent> getAllEvents() {
        return calendarEventService.getAllEvents();
    }
}
