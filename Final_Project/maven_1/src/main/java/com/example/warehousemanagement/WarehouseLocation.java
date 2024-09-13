package com.example.warehousemanagement;

public class WarehouseLocation {
    private String locationID;
    private String description;
    private int capacity;

    public WarehouseLocation(String locationID, String description, int capacity) {
        this.locationID = locationID;
        this.description = description;
        this.capacity = capacity;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void updateLocation(String description, int capacity) {
        this.description = description;
        this.capacity = capacity;
    }

    public void displayLocation() {
        System.out.println("LocationID: " + locationID + ", Description: " + description + ", Capacity: " + capacity);
    }
}
