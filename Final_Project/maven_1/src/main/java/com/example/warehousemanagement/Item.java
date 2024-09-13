package com.example.warehousemanagement;

public class Item {
    private String itemID;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Item(String itemID, String name, String description, int quantity, double price) {
        this.itemID = itemID;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayItem() {
        System.out.println("ItemID: " + itemID + ", Name: " + name + ", Description: " + description + ", Quantity: "
                + quantity + ", Price: " + price);
    }
}
