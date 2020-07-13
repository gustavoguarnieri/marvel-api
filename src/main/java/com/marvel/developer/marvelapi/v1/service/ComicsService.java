package com.marvel.developer.marvelapi.v1.service;

import com.marvel.developer.marvelapi.v1.model.entity.ComicsEntity;
import com.marvel.developer.marvelapi.v1.model.repository.ComicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComicsService {

    @Autowired
    private ComicsRepository comicsRepository;

    public ResponseEntity<ComicsEntity> getComicsById(Long comicId) {
        try{
            Optional<ComicsEntity> comicEntity = comicsRepository.findById(comicId);

            if (!comicEntity.isPresent()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(comicEntity.get(), HttpStatus.OK);

        }catch(Exception ex){
            ex.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

}
