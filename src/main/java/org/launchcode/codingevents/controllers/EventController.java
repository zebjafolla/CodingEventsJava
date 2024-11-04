package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    private static List<Event> events = new ArrayList<>();
    static{
        events.add(new Event("Mentorship", "A fun meetup for connecting with mentors", "Philadelphia", "/images/philadelphia.jpg"));
        events.add(new Event("Code With Pride", "A fun meetup sponsored by LaunchCode", "New York City", "/images/philadelphia.jpg"));
        events.add(new Event("Javascripty", "An imaginary meetup for Javascript developers", "St Louis", "/images/philadelphia.jpg"));
    }


    @GetMapping
    public String displayAllEvents(Model model) {

        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, String description, String location, String pictureURL, Model model) {
        events.add(new Event(eventName, description, location, pictureURL));
        model.addAttribute("events", events);
        return "redirect:/events";
    }

}
