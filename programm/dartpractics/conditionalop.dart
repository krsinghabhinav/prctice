import 'dart:io';

void main() {
  stdout.write("Enter the status: ");

  // Read input from user and store it in a String variable
  String status =
      stdin.readLineSync() ?? ''; // Default to empty string if input is null

  // Example condition checks
  // if (status == "Pending") {
  //   print("Order is pending");
  // } else if (status == "Shipped") {
  //   print("Order is shipped");
  // } else if (status == "Delivered") {
  //   print("Order is delivered");
  // } else if (status == "Cancelled") {
  //   print("Order is cancelled");
  // } else {
  //   print("Invalid order status");
  // }

  if (status.isEmpty == "Pending") {
    print("Order is pending");
  } else if (status.isEmpty == "Shipped") {
    print("Order is shipped");
  } else if (status.isEmpty == "Delivered") {
    print("Order is delivered");
  } else if (status.isEmpty == "cancelled") {
    print("Order is cancelled");
  } else {
    print("Invalid order status");
  }
}
