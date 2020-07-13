package com.marvel.developer.marvelapi.v1.model.repository;

import com.marvel.developer.marvelapi.v1.model.entity.ComicsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComicsRepository extends JpaRepository<ComicsEntity, Long> {
    List<ComicsEntity> findByCharacterId(Long charId);
}

