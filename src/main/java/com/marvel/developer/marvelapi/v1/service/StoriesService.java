package com.marvel.developer.marvelapi.v1.service;

import com.marvel.developer.marvelapi.v1.model.entity.StoriesEntity;
import com.marvel.developer.marvelapi.v1.model.repository.StoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StoriesService {

    @Autowired
    private StoriesRepository storiesRepository;

    public ResponseEntity<StoriesEntity> getStoriesById(Long storiesId) {
        try{
            Optional<StoriesEntity> storiesEntity = storiesRepository.findById(storiesId);

            if (!storiesEntity.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(storiesEntity.get(), HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
