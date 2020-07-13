package com.marvel.developer.marvelapi.v1.model.repository;

import com.marvel.developer.marvelapi.v1.model.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {}