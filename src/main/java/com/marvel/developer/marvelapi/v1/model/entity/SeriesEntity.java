package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "series")
public class SeriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(length = 600)
    private String description;
    @Transient
    private String resourceURI;
    private Integer startYear;
    private Integer endYear;
    @ManyToOne
    private CharacterEntity character;

    @OneToMany
    @JoinColumn(name = "series_id", referencedColumnName = "id")
    private List<ItemsEntity> items;

    public SeriesEntity(Long id, String title, String description, String resourceURI, Integer startYear, Integer endYear, List<ItemsEntity> items) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resourceURI = resourceURI;
        this.startYear = startYear;
        this.endYear = endYear;
        this.items = items;
    }

    public SeriesEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceURI() {
        return (resourceURI == null ? "" :  resourceURI) + "v1/public/series/" + this.id;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }
}
