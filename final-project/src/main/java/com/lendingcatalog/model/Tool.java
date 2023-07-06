package com.lendingcatalog.model;

import com.lendingcatalog.util.FileStorageService;

import java.util.UUID;

public class Tool implements CatalogItem {
//attributes
    private String id;
    private String type;
    private String manufacturer;
    private int count;

//Constructor
    public Tool(String id, String type, String manufacturer, int count) {
        this.id = id;
        this.type = type;
        this.manufacturer = manufacturer;
        this.count = count;
    }

//Methods
    public String toString() {
        return "* " + type + System.lineSeparator()
            + " - Manufacturer: " + manufacturer + System.lineSeparator()
            + " - Count: " + count + System.lineSeparator()
            + " - Id: " + id;
    }
//Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
//Implemented Catalog Interface Methods
    @Override
    public boolean matchesName(String searchStr) {
        return getType().toLowerCase().contains(searchStr.toLowerCase());
    }

    @Override
    public boolean matchesCreator(String searchStr) {
        return getManufacturer().toLowerCase().contains(searchStr.toLowerCase());
    }

    @Override
    public boolean matchesYear(int searchYear) {
        return false;
    }

    @Override
    public void registerItem() {
        setId(UUID.randomUUID().toString());
        String logEntry = toString();
        writeLogEntry("tool_log.txt", logEntry);
    }

    private void writeLogEntry(String logFileName, String logEntry) {
        FileStorageService.writeContentsToFile(logEntry, logFileName, true);
    }

}
