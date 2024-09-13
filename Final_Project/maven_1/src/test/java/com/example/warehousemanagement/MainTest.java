package com.example.warehousemanagement;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private List<Item> items;
    private List<Customer> customers;
    private List<WarehouseLocation> locations;
    private List<Order> orders;

    @Before
    public void setup() {
        items = new ArrayList<>();
        customers = new ArrayList<>();
        locations = new ArrayList<>();
        orders = new ArrayList<>();

        // Initialize sample data for testing
        items.add(new Item("1", "Widget", "This is a widget", 1000, 3.99));
        items.add(new Item("2", "Fidget", "Fidgets are not Widgets", 1000, 4.99));
        items.add(new Item("3", "Gadgets", "Gadgets are the best", 1000, 6.99));

        customers.add(new Customer("1", "Box A Lot", "receiving@bALot.com"));
        customers.add(new Customer("2", "Serv U", "owner@servu.com"));
        customers.add(new Customer("3", "Someplace", "someGuy@somePlace.com"));

        locations.add(new WarehouseLocation("A1", "Racking", 5000));
        locations.add(new WarehouseLocation("A2", "Racking", 4000));
        locations.add(new WarehouseLocation("B1", "Racking", 10000));
    }

    @Test
    public void testAddItem() {
        Item newItem = new Item("4", "Gizmo", "This is a Gizmo", 500, 2.99);
        items.add(newItem);
        assertEquals(4, items.size());
        assertEquals("Gizmo", items.get(3).getName());
    }

    @Test
    public void testDeleteItem() {
        String itemIdToDelete = "1";
        items.removeIf(item -> item.getItemID().equals(itemIdToDelete));
        assertEquals(2, items.size());
        assertFalse(items.stream().anyMatch(item -> item.getItemID().equals(itemIdToDelete)));
    }

    @Test
    public void testUpdateItem() {
        String itemIdToUpdate = "2";
        Item updatedItem = null;
        for (Item item : items) {
            if (item.getItemID().equals(itemIdToUpdate)) {
                item.setName("Updated Fidget");
                item.setDescription("Updated description");
                item.setQuantity(2000);
                item.setPrice(5.99);
                updatedItem = item;
                break;
            }
        }
        assertNotNull(updatedItem);
        assertEquals("Updated Fidget", updatedItem.getName());
        assertEquals("Updated description", updatedItem.getDescription());
        assertEquals(2000, updatedItem.getQuantity());
    }

    @Test
    public void testAddWarehouseLocation() {
        WarehouseLocation newLocation = new WarehouseLocation("C1", "Storage", 7000);
        locations.add(newLocation);
        assertEquals(4, locations.size());
        assertEquals("C1", locations.get(3).getLocationID());
    }

    @Test
    public void testDeleteWarehouseLocation() {
        String locationIdToDelete = "A2";
        locations.removeIf(location -> location.getLocationID().equals(locationIdToDelete));
        assertEquals(2, locations.size());
        assertFalse(locations.stream().anyMatch(location -> location.getLocationID().equals(locationIdToDelete)));
    }

    @Test
    public void testUpdateWarehouseLocation() {
        String locationIdToUpdate = "B1";
        WarehouseLocation updatedLocation = null;
        for (WarehouseLocation location : locations) {
            if (location.getLocationID().equals(locationIdToUpdate)) {
                location.setDescription("Updated Storage");
                location.setCapacity(12000);
                updatedLocation = location;
                break;
            }
        }
        assertNotNull(updatedLocation);
        assertEquals("Updated Storage", updatedLocation.getDescription());
        assertEquals(12000, updatedLocation.getCapacity());
    }

    @Test
    public void testAddCustomer() {
        Customer newCustomer = new Customer("4", "New Customer", "newcustomer@example.com");
        customers.add(newCustomer);
        assertEquals(4, customers.size());
        assertEquals("New Customer", customers.get(3).getName());
    }

    @Test
    public void testDeleteCustomer() {
        String customerIdToDelete = "1";
        customers.removeIf(customer -> customer.getCustomerID().equals(customerIdToDelete));
        assertEquals(2, customers.size());
        assertFalse(customers.stream().anyMatch(customer -> customer.getCustomerID().equals(customerIdToDelete)));
    }

    @Test
    public void testUpdateCustomer() {
        String customerIdToUpdate = "2";
        Customer updatedCustomer = null;
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerIdToUpdate)) {
                customer.setName("Updated Customer");
                customer.setContactInformation("updated@example.com");
                updatedCustomer = customer;
                break;
            }
        }
        assertNotNull(updatedCustomer);
        assertEquals("Updated Customer", updatedCustomer.getName());
        assertEquals("updated@example.com", updatedCustomer.getContactInformation());
    }

    @Test
    public void testAddOrder() {
        Customer customer = customers.get(0);
        List<Item> orderItems = new ArrayList<>();
        orderItems.add(new Item("1", "Widget", "This is a widget", 10, 3.99));
        Order newOrder = new Order(orders.size() + 1, customer, orderItems, "Processing");
        orders.add(newOrder);
        assertEquals(1, orders.size());
        assertEquals("Processing", orders.get(0).getStatus());
    }

    @Test
    public void testDeleteOrder() {
        Customer customer = customers.get(0);
        List<Item> orderItems = new ArrayList<>();
        orderItems.add(new Item("1", "Widget", "This is a widget", 10, 3.99));
        Order order = new Order(orders.size() + 1, customer, orderItems, "Processing");
        orders.add(order);

        orders.removeIf(o -> o.getOrderID() == order.getOrderID());
        assertEquals(0, orders.size());
    }

    @Test
    public void testUpdateOrder() {
        Customer customer = customers.get(0);
        List<Item> orderItems = new ArrayList<>();
        orderItems.add(new Item("1", "Widget", "This is a widget", 10, 3.99));
        Order order = new Order(orders.size() + 1, customer, orderItems, "Processing");
        orders.add(order);

        Order updatedOrder = null;
        for (Order o : orders) {
            if (o.getOrderID() == order.getOrderID()) {
                o.setStatus("Shipped");
                updatedOrder = o;
                break;
            }
        }
        assertNotNull(updatedOrder);
        assertEquals("Shipped", updatedOrder.getStatus());
    }
}
