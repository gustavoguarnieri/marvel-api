package com.marvel.developer.marvelapi.v1.service;

import com.marvel.developer.marvelapi.v1.model.entity.SeriesEntity;
import com.marvel.developer.marvelapi.v1.model.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeriesService {

    @Autowired
    private SeriesRepository seriesRepository;

    public ResponseEntity<SeriesEntity> getSeriesById(Long seriesId) {
        try{
            Optional<SeriesEntity> seriesEntity = seriesRepository.findById(seriesId);

            if (!seriesEntity.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(seriesEntity.get(), HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
