package com.marvel.developer.marvelapi.v1.service;

import com.marvel.developer.marvelapi.v1.model.entity.EventsEntity;
import com.marvel.developer.marvelapi.v1.model.repository.EventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventsService {

    @Autowired
    private EventsRepository eventsRepository;

    public ResponseEntity<EventsEntity> getEventsById(Long eventId) {
        try{
            Optional<EventsEntity> eventsEntity = eventsRepository.findById(eventId);

            if (!eventsEntity.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(eventsEntity.get(), HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
