package com.example.warehousemanagement;

import java.util.List;

public class Order {
    private int orderID;
    private Customer customer;
    private List<Item> items;
    private String status;

    public Order(int orderID, Customer customer, List<Item> items, String status) {
        this.orderID = orderID;
        this.customer = customer;
        this.items = items;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void updateOrder(List<Item> items, String status) {
        this.items = items;
        this.status = status;
    }

    public void deleteOrder(List<Item> items) {
        items.removeAll(items);
        this.status = "Cancelled";
        updateOrder(items, this.status);
    }

    public void displayOrder() {
        System.out.println("OrderID: " + orderID + ", Customer: " + customer.getName() + ", Status: " + status);
        for (Item item : items) {
            item.displayItem();
        }
    }

}
