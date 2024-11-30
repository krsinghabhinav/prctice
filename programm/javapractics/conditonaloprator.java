package programm.javapractics;

import java.util.Scanner;

class ConditionalOperator {
    public static void main(String[] args) {
        // Declare the order status options
        // String orderPending = "Pending";
        // String orderShipped = "Shipped";
        // String orderDelivered = "Delivered";
        // String orderCancelled = "Cancelled";

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user for the order status
        System.out.print("Enter order status (Pending, Shipped, Delivered, Cancelled): ");
        String orderStatus = sc.nextLine();  // Take user input

        // Use a switch statement to handle different order statuses
        switch (orderStatus) {
            case "Pending":
                System.out.println("Order is Pending");
                break;
            case "Shipped":
                System.out.println("Order is Shipped");
                break;
            case "Delivered":
                System.out.println("Order is Delivered");
                break;
            case "Cancelled":
                System.out.println("Order is Cancelled");
                break;
            default:
                System.out.println("Invalid order status");
                break;
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
