package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "events")
public class EventsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(length = 600)
    private String description;
    @Transient
    private String resourceURI;
    @Temporal(TemporalType.TIMESTAMP)
    private Date start;
    @Temporal(TemporalType.TIMESTAMP)
    private Date end;
    @ManyToOne
    private CharacterEntity character;

    @OneToMany
    @JoinColumn(name = "events_id", referencedColumnName = "id")
    private List<ItemsEntity> items;

    public EventsEntity(Long id, String title, String description, String resourceURI, Date start, Date end,
                        List<ItemsEntity> items) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resourceURI = resourceURI;
        this.start = start;
        this.end = end;
        this.items = items;
    }

    public EventsEntity(){}

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
        return (resourceURI == null ? "" :  resourceURI) + "v1/public/events/" + this.id;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }
}
