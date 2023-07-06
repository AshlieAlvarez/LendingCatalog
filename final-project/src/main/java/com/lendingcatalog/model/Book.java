package com.lendingcatalog.model;

import com.lendingcatalog.util.FileStorageService;

import java.time.LocalDate;
import java.util.UUID;

public class Book implements CatalogItem {
//attributes
    private String id;
    private String title;
    private String author;
    private LocalDate publishDate;

//Constructor
    public Book(String id, String title, String author, LocalDate publishDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

//Methods
public String toString() {
    return "* " + title + System.lineSeparator()
            + " - Written by: " + author + System.lineSeparator()
            + " - Published: " + publishDate + System.lineSeparator()
            + " - Id: " + id;
    }


//Getters & Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
//Implemented Catalog Interface Methods
    @Override
    public boolean matchesName(String searchStr) {
        return getTitle().toLowerCase().contains(searchStr.toLowerCase());
    }

    @Override
    public boolean matchesCreator(String searchStr) {
        return getAuthor().toLowerCase().contains(searchStr.toLowerCase());
    }

    @Override
    public boolean matchesYear(int searchYear) {
        int publishYear = getPublishDate().getYear();
        return publishYear == searchYear;
    }

    @Override
    public void registerItem() {
        setId(UUID.randomUUID().toString());
        String logEntry = toString();
        writeLogEntry("book_log.txt", logEntry);
    }

    private void writeLogEntry(String logFileName, String logEntry) {
        FileStorageService.writeContentsToFile(logEntry, logFileName, true);
    }


}
