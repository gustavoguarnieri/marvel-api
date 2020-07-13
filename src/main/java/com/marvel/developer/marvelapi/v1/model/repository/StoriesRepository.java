package com.marvel.developer.marvelapi.v1.model.repository;

import com.marvel.developer.marvelapi.v1.model.entity.StoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoriesRepository extends JpaRepository<StoriesEntity, Long> {
    List<StoriesEntity> findByCharacterId(Long charId);
}

