package com.marvel.developer.marvelapi.v1.model.repository;

import com.marvel.developer.marvelapi.v1.model.entity.SeriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesRepository extends JpaRepository<SeriesEntity, Long> {
    List<SeriesEntity> findByCharacterId(Long charId);
}

