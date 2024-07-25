package org.example;

public class Product {
    private String name;
    private double cost;
    private int quantity;

    // Constructor
    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    // Method to calculate and print the total cost
    public void totalCost() {
        double total = cost * quantity;
        System.out.println("Total cost for " + quantity + " " + name + "(s): $" + total);
    }

    // Method to print product details
    public void printProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Cost per unit: $" + cost);
        System.out.println("Quantity: " + quantity);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Product object
        Product product = new Product("Gallon of gas", 4.0, 10);

        // Print the product details
        product.printProduct();

        // Print the total cost
        product.totalCost();
    }
}
