// package programm.javapractics;

// import java.util.Scanner;

// public class ifcondition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter order status (Pending, Shipped, Delivered, Cancelled): ");
//         String status = sc.nextLine();

//         // Use equals() method for string comparison
//         if (status.equalsIgnoreCase("Pending")) {
//             System.out.println("Order is pending");
//         } else if (status.equalsIgnoreCase("Shipped")) {
//             System.out.println("Order is shipped");
//         } else if (status.equalsIgnoreCase("Delivered")) {
//             System.out.println("Order is delivered");
//         } else if (status.equalsIgnoreCase("Cancelled")) {
//             System.out.println("Order is cancelled");
//         } else {
//             System.out.println("Invalid order status");
//         }

//         // Close the scanner to prevent resource leaks
//         sc.close();
//     }
// }


// package programm.javapractics;

// import java.util.Scanner;

// public class ifcondition {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter order status (Pending, Shipped, Delivered, Cancelled): ");
//         String status = sc.nextLine();

//         // Use .equals() for string comparison
//         if (status.equals("Pending")) {
//             System.out.println("Order is pending");
//         } else if (status.equals("Shipped")) {
//             System.out.println("Order is shipped");
//         } else if (status.equals("Delivered")) {
//             System.out.println("Order is delivered");
//         } else if (status.equals("Cancelled")) {
//             System.out.println("Order is cancelled");
//         } else {
//             System.out.println("Invalid order status");
//         }

//         // Close the scanner to prevent resource leaks
//         sc.close();
//     }
// }



package programm.javapractics;

import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order status (Pending, Shipped, Delivered, Cancelled): ");
        String status = sc.nextLine();

        // Using == to compare with string literals directly
        if (status == "Pending") {
            System.out.println("Order is pending");
        } else if (status == "Shipped") {
            System.out.println("Order is shipped");
        } else if (status == "Delivered") {
            System.out.println("Order is delivered");
        } else if (status == "Cancelled") {
            System.out.println("Order is cancelled");
        } else {
            System.out.println("Invalid order status");
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}