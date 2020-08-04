package com.marvel.developer.marvelapi.v1.controllers;

import com.marvel.developer.marvelapi.v1.model.entity.*;
import com.marvel.developer.marvelapi.v1.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/public/characters")
public class CharacterController {

    @Autowired
    CharacterService characterService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CharacterEntity>> getCharacters(){
        return characterService.getAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{charId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CharacterEntity> getCharacterById(@PathVariable Long charId){
        return characterService.getCharacterById(charId);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{charId}/comics", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ComicsEntity>> getComicsByCharacterId(@PathVariable Long charId){
        return characterService.getComicsByCharacterId(charId);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{charId}/events", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EventsEntity>> getEventsByCharacterId(@PathVariable Long charId){
        return characterService.getEventsByCharacterId(charId);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{charId}/series", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SeriesEntity>> getSeriesByCharacterId(@PathVariable Long charId){
        return characterService.getSeriesByCharacterId(charId);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{charId}/stories", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StoriesEntity>> getStoriesByCharacterId(@PathVariable Long charId){
        return characterService.getStoriesByCharacterId(charId);
    }

}
