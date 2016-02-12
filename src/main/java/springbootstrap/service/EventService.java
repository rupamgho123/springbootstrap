package springbootstrap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;
import springbootstrap.domain.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by rupam.ghosh on 11/07/15.
 */
@Component("eventService")
public class EventService{

    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllEvents(){
        Pageable pageable = new PageRequest(1,100);
        Page<Event> page = eventRepository.findAll(pageable);
        return page.getContent();
    }
}
