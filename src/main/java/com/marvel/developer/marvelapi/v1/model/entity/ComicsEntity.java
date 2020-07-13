package com.marvel.developer.marvelapi.v1.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comics")
public class ComicsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer issueNumber;
    private String variantDescription;
    @Column(length = 600)
    private String description;
    @Transient
    private String resourceURI;
    @ManyToOne
    private CharacterEntity character;

    @OneToMany
    @JoinColumn(name = "comics_id", referencedColumnName = "id")
    private List<ItemsEntity> items;

    public ComicsEntity(Long id, String title, Integer issueNumber, String variantDescription,
                        String description, String resourceURI, List<ItemsEntity> items) {
        this.id = id;
        this.title = title;
        this.issueNumber = issueNumber;
        this.variantDescription = variantDescription;
        this.description = description;
        this.resourceURI = resourceURI;
        this.items = items;
    }

    public ComicsEntity(){}

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

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceURI() {
        return (resourceURI == null ? "" :  resourceURI) + "v1/public/comics/" + this.id;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }
}
