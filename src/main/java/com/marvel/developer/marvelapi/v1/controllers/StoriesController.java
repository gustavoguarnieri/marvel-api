package com.marvel.developer.marvelapi.v1.controllers;

import com.marvel.developer.marvelapi.v1.model.entity.StoriesEntity;
import com.marvel.developer.marvelapi.v1.service.StoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/public/stories")
public class StoriesController {

    @Autowired
    StoriesService storiesService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{storyId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StoriesEntity> getSeriesById(@PathVariable Long storyId){
        return storiesService.getStoriesById(storyId);
    }

}
