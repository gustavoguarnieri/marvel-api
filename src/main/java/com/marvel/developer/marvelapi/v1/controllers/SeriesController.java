package com.marvel.developer.marvelapi.v1.controllers;

import com.marvel.developer.marvelapi.v1.model.entity.SeriesEntity;
import com.marvel.developer.marvelapi.v1.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/public/series")
public class SeriesController {

    @Autowired
    SeriesService seriesService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{serieId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SeriesEntity> getSeriesById(@PathVariable Long serieId){
        return seriesService.getSeriesById(serieId);
    }

}
