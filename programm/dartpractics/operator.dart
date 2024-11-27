import 'dart:io';

void main() {
  print("Enter first number");
  int a = int.parse(stdin.readLineSync()!);
  print("Enter second number");
  int b = int.parse((stdin.readLineSync()!));

  int sum = a + b;
  int difference = a - b;
  int product = a * b;
  int quotient = a ~/ b;
  int remainder = a % b;
  print("Sum: $sum");
  print("Difference: $difference");
  print("Product: $product");
  print("Quotient: $quotient");
  print("Remainder: $remainder");
}
