package com.marvel.developer.marvelapi.v1.controllers;

import com.marvel.developer.marvelapi.v1.model.entity.ComicsEntity;
import com.marvel.developer.marvelapi.v1.service.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/public/comics")
public class ComicsController {

    @Autowired
    ComicsService comicsService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{comicId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ComicsEntity> getCharacterById(@PathVariable Long comicId){
        return comicsService.getComicsById(comicId);
    }

}
