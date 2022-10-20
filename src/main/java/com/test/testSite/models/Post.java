package com.test.testSite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* Creating table in BD (columns) */

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title, anons, text_of_story;
    private int views;

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

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getText_of_story() {
        return text_of_story;
    }

    public void setText_of_story(String text_of_story) {
        this.text_of_story = text_of_story;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Post(){
    }
    public Post(String title, String anons, String text_of_story) {
        this.title = title;
        this.anons = anons;
        this.text_of_story = text_of_story;
    }
}
