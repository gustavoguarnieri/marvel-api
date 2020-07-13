package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stories")
public class StoriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(length = 600)
    private String description;
    @Transient
    private String resourceURI;
    private String type;
    @ManyToOne
    private CharacterEntity character;

    @OneToMany
    @JoinColumn(name = "stories_id", referencedColumnName = "id")
    private List<ItemsEntity> items;

    public StoriesEntity(Long id, String title, String description, String resourceURI, String type, List<ItemsEntity> items) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resourceURI = resourceURI;
        this.type = type;
        this.items = items;
    }

    public StoriesEntity(){}

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
        return (resourceURI == null ? "" :  resourceURI) + "v1/public/stories/" + this.id;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }
}
