package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class ItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resourceURI;
    private String name;
    private String type;

    public ItemsEntity(Long id, String resourceURI, String name, String type) {
        this.id = id;
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }

    public ItemsEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
