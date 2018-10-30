package com.heuristica.ksroutewinthorcli.repositories;

import com.heuristica.ksroutewinthorcli.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>  {
    
}
