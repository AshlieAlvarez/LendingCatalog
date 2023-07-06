package com.lendingcatalog.model;

import com.lendingcatalog.util.FileStorageService;

import java.time.LocalDate;
import java.util.UUID;

public class Movie implements CatalogItem{
//attributes
    private String id;
    private String name;
    private String director;
    private LocalDate releaseDate;

//Constructor
    public Movie(String id, String name, String director, LocalDate releaseDate) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.releaseDate = releaseDate;
    }

//Methods
public String toString() {
    return "* " + name + System.lineSeparator()
            + " - Directed by: " + director + System.lineSeparator()
            + " - Released: " + releaseDate + System.lineSeparator()
            + " - Id: " + id;
    }

//Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
//Implemented Catalog Interface Methods
    @Override
    public boolean matchesName(String searchStr) {
        return getName().toLowerCase().contains(searchStr.toLowerCase());
    }

    @Override
    public boolean matchesCreator(String searchStr) {
        return getDirector().toLowerCase().contains(searchStr.toLowerCase());
    }

    @Override
    public boolean matchesYear(int searchYear) {
        int releaseYear = getReleaseDate().getYear();
        return releaseYear == searchYear;
    }

    @Override
    public void registerItem() {
        setId(UUID.randomUUID().toString());
        String logEntry = toString();
        writeLogEntry("movie_log.txt", logEntry);
    }

    private void writeLogEntry(String logFileName, String logEntry) {
        FileStorageService.writeContentsToFile(logEntry, logFileName, true);
    }

}
