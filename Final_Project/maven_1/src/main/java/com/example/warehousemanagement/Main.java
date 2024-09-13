package com.example.warehousemanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        List<WarehouseLocation> locations = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String itemID, itemName, itemDescription; // Item strings
        String locationID, locationDescription; // Location strings
        String customerID, customerName, customerContact; // Customer strings
        String orderStatus; // Order
        int itemQuantity, locationCapacity, orderID;
        double itemPrice; // Item price
        boolean exists;

        // Initialize sample data for testing
        Item item1 = new Item("1", "Widget", "This is a widget", 1000, 3.99);
        Item item2 = new Item("2", "Fidget", "Fidgets are not Widgets", 1000, 4.99);
        Item item3 = new Item("3", "Gadgets", "Gadgets are the best", 1000, 6.99);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Customer customer1 = new Customer("1", "Box A Lot", "receiving@bALot.com");
        Customer customer2 = new Customer("2", "Serv U", "owner@servu.com");
        Customer customer3 = new Customer("3", "Someplace", "someGuy@somePlace.com");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        WarehouseLocation loc1 = new WarehouseLocation("A1", "Racking", 5000);
        WarehouseLocation loc2 = new WarehouseLocation("A2", "Racking", 4000);
        WarehouseLocation loc3 = new WarehouseLocation("B1", "Racking", 10000);
        locations.add(loc1);
        locations.add(loc2);
        locations.add(loc3);

        while (true) {
            System.out.println("\nWarehouse Management System");
            System.out.println(" 1. Add Item");
            System.out.println(" 2. Delete Item");
            System.out.println(" 3. Update Item");
            System.out.println(" 4. Display All Items");
            System.out.println(" 5. Add Warehouse Location");
            System.out.println(" 6. Delete Warehouse Location");
            System.out.println(" 7. Update Warehouse Location");
            System.out.println(" 8. Display All Warehouse Locations");
            System.out.println(" 9. Add Customer");
            System.out.println("10. Delete Customer");
            System.out.println("11. Update Customer");
            System.out.println("12. Display All Customers");
            System.out.println("13. Add Order");
            System.out.println("14. Delete Order");
            System.out.println("15. Update Order");
            System.out.println("16. Display All Orders");
            System.out.println("17. Exit");
            System.out.print("Enter your choice: ");

            try {
                exists = false; // Resets boolean
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.print("Enter item ID: ");
                        itemID = scanner.nextLine();
                        for (Item it : items) {
                            if (it.getItemID().equals(itemID)) {
                                System.out.println("Item ID is already in system.");
                                exists = true;
                                break;
                            }
                        }
                        if (exists) {
                            break;
                        }
                        System.out.print("Enter item name: ");
                        itemName = scanner.nextLine();
                        System.out.print("Enter item description: ");
                        itemDescription = scanner.nextLine();
                        System.out.print("Enter item quantity: ");
                        itemQuantity = scanner.nextInt();
                        System.out.print("Enter item price: ");
                        itemPrice = scanner.nextDouble();
                        scanner.nextLine(); // consume newline
                        Item newItem = new Item(itemID, itemName, itemDescription, itemQuantity, itemPrice);
                        items.add(newItem);
                        System.out.println("Item added successfully: " + newItem.getItemID());
                        break;
                    case 2:
                        Item tempItem = null;
                        System.out.println("Enter item ID: ");
                        itemID = scanner.nextLine();
                        for (Item it : items) {
                            if (it.getItemID().equals(itemID)) {
                                tempItem = it;
                                break;
                            }
                        }
                        if (tempItem.getItemID().equals(itemID)) {
                            items.remove(tempItem);
                            System.out.println("Item deleted.");
                        } else {
                            System.out.println("Item is not in inventory.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter item ID: ");
                        itemID = scanner.nextLine();
                        for (Item it : items) {
                            if (it.getItemID().equals(itemID)) {
                                System.out.print("Enter item name: ");
                                itemName = scanner.nextLine();
                                it.setName(itemName);
                                System.out.print("Enter item description: ");
                                itemDescription = scanner.nextLine();
                                it.setDescription(itemDescription);
                                System.out.print("Enter item quantity: ");
                                itemQuantity = scanner.nextInt();
                                it.setQuantity(itemQuantity);
                                System.out.print("Enter item price: ");
                                itemPrice = scanner.nextDouble();
                                it.setPrice(itemPrice);
                                System.out.println("Item updated.");
                            } else {
                                System.out.println("Item is not in inventory.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("All Items:");
                        for (Item it : items) {
                            it.displayItem();
                        }
                        break;
                    case 5:
                        System.out.print("Enter location ID: ");
                        locationID = scanner.nextLine();
                        for (WarehouseLocation loc : locations) {
                            if (loc.getLocationID().equals(locationID)) {
                                System.out.println("Location already in system.");
                                exists = true;
                                break;
                            }
                        }

                        if (exists) {
                            break;
                        }
                        System.out.print("Enter location description: ");
                        locationDescription = scanner.nextLine();
                        System.out.print("Enter location capacity: ");
                        locationCapacity = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        WarehouseLocation location = new WarehouseLocation(locationID, locationDescription,
                                locationCapacity);
                        locations.add(location);
                        System.out.println("Location added successfully: " + location.getLocationID());
                        break;
                    case 6:
                        WarehouseLocation tempLoc = null;
                        System.out.print("Enter location ID: ");
                        locationID = scanner.nextLine();
                        for (WarehouseLocation loc : locations) {
                            if (loc.getLocationID().equals(locationID)) {
                                tempLoc = loc;
                            }
                        }
                        if (tempLoc.getLocationID().equals(locationID)) {
                            locations.remove(tempLoc);
                            System.out.println("Location deleted.");
                        } else {
                            System.out.println("Location does not exist.");
                        }
                        break;
                    case 7:
                        System.out.print("Enter location ID: ");
                        locationID = scanner.nextLine();

                        for (WarehouseLocation loc : locations) {
                            if (loc.getLocationID().equals(locationID)) {
                                System.out.print("Enter location description: ");
                                locationDescription = scanner.nextLine();
                                loc.setDescription(locationDescription);
                                System.out.print("Enter location capacity: ");
                                locationCapacity = scanner.nextInt();
                                loc.setCapacity(locationCapacity);
                            } else {
                                System.out.println("Location does not exist.");
                            }
                        }
                        break;
                    case 8:
                        System.out.println("All Warehouse Locations:");
                        for (WarehouseLocation loc : locations) {
                            loc.displayLocation();
                        }
                        break;
                    case 9:
                        System.out.print("Enter customer ID: ");
                        customerID = scanner.nextLine();
                        for (Customer c : customers) {
                            if (c.getCustomerID().equals(customerID)) {
                                System.out.println("Customer ID already in system.");
                                exists = true;
                                break;
                            }
                        }

                        if (exists) {
                            break;
                        }

                        System.out.print("Enter customer name: ");
                        customerName = scanner.nextLine();
                        System.out.print("Enter customer contact information: ");
                        customerContact = scanner.nextLine();
                        Customer customer = new Customer(customerID, customerName, customerContact);
                        customers.add(customer);
                        System.out.println("Customer added successfully: " + customer.getCustomerID());
                        break;
                    case 10:
                        Customer tempCust = null;
                        System.out.println("Enter customer ID: ");
                        customerID = scanner.nextLine();

                        for (Customer c : customers) {
                            if (c.getCustomerID().equals(customerID)) {
                                tempCust = c;
                            }
                        }
                        if (tempCust.getCustomerID().equals(customerID)) {
                            customers.remove(tempCust);
                            System.out.println("Customer removed.");
                        } else {
                            System.out.println("Customer not found.");
                        }
                        break;
                    case 11:
                        System.out.println("Enter customer ID: ");
                        customerID = scanner.nextLine();

                        for (Customer c : customers) {
                            if (c.getCustomerID().equals(customerID)) {
                                System.out.print("Enter customer name: ");
                                customerName = scanner.nextLine();
                                System.out.print("Enter customer contact information: ");
                                customerContact = scanner.nextLine();
                                c.updateCustomer(customerName, customerContact);
                            } else {
                                System.out.println("Customer not in system.");
                            }
                        }
                        break;
                    case 12:
                        System.out.println("All Customers:");
                        for (Customer c : customers) {
                            c.displayCustomer();
                        }
                        break;
                    case 13:
                        orderID = orders.size() + 1; // Increases order size
                        System.out.print("Enter customer ID for the order: ");
                        customerID = scanner.nextLine();
                        customer = null;
                        for (Customer c : customers) {
                            if (c.getCustomerID().equals(customerID)) {
                                customer = c;
                                break;
                            }
                        }
                        if (customer == null) {
                            System.out.println("Customer not found with ID: " + customerID);
                            break;
                        }
                        List<Item> orderItems = new ArrayList<>();
                        System.out.print("Enter number of items in the order: ");
                        int numItems = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        for (int i = 0; i < numItems; i++) {
                            System.out.print("Enter item ID for order item " + (i + 1) + ": ");
                            itemID = scanner.nextLine();
                            for (Item it : items) {
                                if (it.getItemID().equals(itemID)) {
                                    System.out.println("Enter Item quantity: ");
                                    itemQuantity = scanner.nextInt();
                                    scanner.nextLine(); // consume newline
                                    Item orderItem = new Item(itemID, it.getName(), it.getDescription(), itemQuantity,
                                            it.getPrice());
                                    it.setQuantity(it.getQuantity() - itemQuantity); // Adjust inventory
                                    orderItems.add(orderItem);
                                }
                            }
                            if (itemID == null) {
                                System.out.println("Item not found with ID: " + itemID);
                                break;
                            }
                        }
                        System.out.print("Enter order status: ");
                        orderStatus = scanner.nextLine();
                        Order order = new Order(orderID, customer, orderItems, orderStatus);
                        orders.add(order);
                        System.out.println("Order added successfully: " + order.getOrderID());
                        break;
                    case 14:
                        Order tempOrder = null;
                        System.out.print("Enter order ID: ");
                        orderID = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        for (Order o : orders) {
                            if (o.getOrderID() == orderID) {
                                tempOrder = o;
                            }
                        }
                        if (tempOrder.getOrderID() == orderID) {
                            orders.remove(tempOrder);
                            System.out.println("Order Deleted.");
                            break;
                        } else {
                            System.out.println("Order not found.");
                        }
                        break;
                    case 15:
                        Order orderUpdate;
                        if (orders.size() == 0) {
                            System.out.println("No orders exist.");
                            break;
                        }
                        System.out.print("Enter order ID: ");
                        orderID = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        for (Order o : orders) {
                            if (o.getOrderID() == orderID) {
                                for (Item it : o.getItems()) {
                                    for (Item it2 : items) {
                                        if (it.getItemID().equals(it2.getItemID())) {
                                            it2.setQuantity(it2.getQuantity() + it.getQuantity());
                                            it.setQuantity(0); // Restocking of old items
                                        }
                                    }
                                }
                                System.out.print("Enter customer ID for the order: ");
                                customerID = scanner.nextLine();
                                customer = null;
                                for (Customer c : customers) {
                                    if (c.getCustomerID().equals(customerID)) {
                                        customer = c;
                                        break;
                                    }
                                }
                                if (customer == null) {
                                    System.out.println("Customer not found with ID: " + customerID);
                                    break;
                                }
                                List<Item> updatedItems = new ArrayList<>();
                                System.out.print("Enter number of items in the order: ");
                                int numItemsUpdated = scanner.nextInt();
                                scanner.nextLine(); // consume newline
                                for (int i = 0; i < numItemsUpdated; i++) {
                                    System.out.print("Enter item ID for order item " + (i + 1) + ": ");
                                    itemID = scanner.nextLine();
                                    for (Item it : items) {
                                        if (it.getItemID().equals(itemID)) {
                                            System.out.println("Enter Item quantity: ");
                                            itemQuantity = scanner.nextInt();
                                            scanner.nextLine(); // consume newline
                                            Item updateOrderItem = new Item(itemID, it.getName(), it.getDescription(),
                                                    itemQuantity, it.getPrice());
                                            it.setQuantity((it.getQuantity() - itemQuantity)); // Adjust inventory

                                            updatedItems.add(updateOrderItem);
                                        }
                                    }
                                    if (itemID == null) {
                                        System.out.println("Item not found with ID: " + itemID);
                                        break;
                                    }

                                }
                                System.out.print("Enter order status: ");
                                orderStatus = scanner.nextLine();
                                orderUpdate = new Order(orderID, customer, updatedItems, orderStatus);
                                orders.remove(o);
                                orders.add(orderUpdate);
                                System.out.println("Order added successfully: " + orderUpdate.getOrderID());
                            } else {
                                System.out.println("Order is not in system.");
                            }
                        }
                        break;
                    case 16:
                        System.out.println("All Orders:");
                        for (Order ord : orders) {
                            ord.displayOrder();
                        }
                        break;
                    case 17:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }
}
