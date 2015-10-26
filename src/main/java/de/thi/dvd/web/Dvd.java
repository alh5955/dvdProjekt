package de.thi.dvd.web;

import java.util.List;

/**
 * Created by Alexander on 26.10.2015.
 */
public class Dvd {
    private String name;
    private String description;
    private String genre;
    private String test;
    private String test2;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getgenre() {
        return genre;
    }
}
