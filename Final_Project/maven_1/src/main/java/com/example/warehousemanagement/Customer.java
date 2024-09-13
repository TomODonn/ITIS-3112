package com.example.warehousemanagement;

public class Customer {
    private String customerID;
    private String name;
    private String contactInformation;

    public Customer(String customerID, String name, String contactInformation) {
        this.customerID = customerID;
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void updateCustomer(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public void displayCustomer() {
        System.out.println(
                "CustomerID: " + customerID + ", Name: " + name + ", Contact Information: " + contactInformation);
    }
}
