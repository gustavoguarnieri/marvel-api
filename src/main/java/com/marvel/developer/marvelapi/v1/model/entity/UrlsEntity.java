package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "urls")
public class UrlsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String url;

    public UrlsEntity(Long id, String type, String url) {
        this.id = id;
        this.type = type;
        this.url = url;
    }

    public UrlsEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
