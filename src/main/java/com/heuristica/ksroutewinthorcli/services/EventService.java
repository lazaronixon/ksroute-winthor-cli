package com.heuristica.ksroutewinthorcli.services;

import com.heuristica.ksroutewinthorcli.models.Event;
import com.heuristica.ksroutewinthorcli.models.Recordable;
import com.heuristica.ksroutewinthorcli.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EventService {
    
    @Autowired private EventRepository events; 
    
    public Event insertRecordable(Recordable recordable) {
            Event event = new Event();
            event.setEventableId(recordable.getRecordableId());
            event.setEventableType(recordable.getRecordableType());
            event.setPersistAction("Save");
            event.setPriority(1);
            return events.save(event);
    }
    
}
