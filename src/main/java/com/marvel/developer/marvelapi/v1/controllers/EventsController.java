package com.marvel.developer.marvelapi.v1.controllers;

import com.marvel.developer.marvelapi.v1.model.entity.EventsEntity;
import com.marvel.developer.marvelapi.v1.service.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/public/events")
public class EventsController {

    @Autowired
    EventsService eventsService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{eventId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EventsEntity> getCharacterById(@PathVariable Long eventId){
        return eventsService.getEventsById(eventId);
    }

}
