package com.marvel.developer.marvelapi.v1.service;

import com.marvel.developer.marvelapi.v1.model.entity.*;
import com.marvel.developer.marvelapi.v1.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;
    @Autowired
    private ComicsRepository comicsRepository;
    @Autowired
    private EventsRepository eventsRepository;
    @Autowired
    private SeriesRepository seriesRepository;
    @Autowired
    private StoriesRepository storiesRepository;

    public ResponseEntity<List<CharacterEntity>> getAll() {
        try{
            List<CharacterEntity> characterEntities = characterRepository.findAll();

            if (characterEntities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(characterEntities, HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<CharacterEntity> getCharacterById(Long charId) {
        try{
            Optional<CharacterEntity> characterEntity = characterRepository.findById(charId);

            if (!characterEntity.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(characterEntity.get(), HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<List<ComicsEntity>> getComicsByCharacterId(Long charId) {
        try{
            List<ComicsEntity> comicsEntity = comicsRepository.findByCharacterId(charId);

            if (comicsEntity.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(comicsEntity, HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<List<EventsEntity>> getEventsByCharacterId(Long charId) {
        try{
            List<EventsEntity> eventsEntity = eventsRepository.findByCharacterId(charId);

            if (eventsEntity.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(eventsEntity, HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<List<SeriesEntity>> getSeriesByCharacterId(Long charId) {
        try{
            List<SeriesEntity> seriesEntity = seriesRepository.findByCharacterId(charId);

            if (seriesEntity.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(seriesEntity, HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    public ResponseEntity<List<StoriesEntity>> getStoriesByCharacterId(Long charId) {
        try{
            List<StoriesEntity> storiesEntity = storiesRepository.findByCharacterId(charId);

            if (storiesEntity.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(storiesEntity, HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
