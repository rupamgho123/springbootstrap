package springbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springbootstrap.domain.Event;
import springbootstrap.service.EventService;

import java.util.List;

/**
 * Created by rupam.ghosh on 11/07/15.
 */
@Controller
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping("/events")
    @ResponseBody
    public List<Event> getEvents(){
        return eventService.getAllEvents();
    }
}
