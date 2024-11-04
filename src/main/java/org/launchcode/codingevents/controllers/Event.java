package org.launchcode.codingevents.controllers;

public class Event {

    private String eventName;
    private String description;
    private String location;
    private String pictureURL;
    public Event(String eventName, String description, String location, String pictureURL) {
        this.eventName = eventName;
        this.description = description;
        this.location = location;
        this.pictureURL = pictureURL;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
