package com.marvel.developer.marvelapi.v1.model.repository;

import com.marvel.developer.marvelapi.v1.model.entity.UrlsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlsRepository extends JpaRepository<UrlsEntity, Long> {}

