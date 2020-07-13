package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "charac")
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(length = 600)
    private String description;
    private String thumbnail;
    @Transient
    private String resourceURI;

    @OneToMany
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private List<ComicsEntity> comics;

    @OneToMany
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private List<SeriesEntity> series;

    @OneToMany
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private List<StoriesEntity> stories;

    @OneToMany
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private List<EventsEntity> events;

    @OneToMany
    @JoinColumn(name = "character_id", referencedColumnName = "id")
    private List<UrlsEntity> urls;

    public CharacterEntity(Long id, String name, String description, String thumbnail, String resourceURI,
                           List<ComicsEntity> comics, List<SeriesEntity> series, List<StoriesEntity> stories,
                           List<EventsEntity> events, List<UrlsEntity> urls) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.resourceURI = resourceURI;
        this.comics = comics;
        this.series = series;
        this.stories = stories;
        this.events = events;
        this.urls = urls;
    }

    public CharacterEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getResourceURI() {
        return (resourceURI == null ? "" :  resourceURI) + "v1/public/characters/" + this.id;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<ComicsEntity> getComics() {
        return comics;
    }

    public void setComics(List<ComicsEntity> comics) {
        this.comics = comics;
    }

    public List<SeriesEntity> getSeries() {
        return series;
    }

    public void setSeries(List<SeriesEntity> series) {
        this.series = series;
    }

    public List<StoriesEntity> getStories() {
        return stories;
    }

    public void setStories(List<StoriesEntity> stories) {
        this.stories = stories;
    }

    public List<EventsEntity> getEvents() {
        return events;
    }

    public void setEvents(List<EventsEntity> events) {
        this.events = events;
    }

    public List<UrlsEntity> getUrls() {
        return urls;
    }

    public void setUrls(List<UrlsEntity> urls) {
        this.urls = urls;
    }
}
