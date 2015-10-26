package de.thi.dvd.web.domain;

import java.util.List;

/**
 * Created by Alexander on 26.10.2015.
 */
public class Dvd {
    private String name;
    private boolean format;
    private String description;
    private String genre;
    private String director;
    private List<String> actors;

    public Dvd(){
    }

    public Dvd(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFormat() {
        return format;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFormat(boolean format) {
        this.format = format;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

}
