package com.example.jrs.Service;

import com.example.jrs.Model.CalendarEvent;
import java.util.List;

public interface CalendarEventService {
    CalendarEvent addEvent(CalendarEvent calendarEvent);
    List<CalendarEvent> getAllEvents();
}
