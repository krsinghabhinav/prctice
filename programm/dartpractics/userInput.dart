import 'dart:io';

void main() {
  print("Enter number");
  int a =
      int.parse(stdin.readLineSync()!); // read a byte from the standard input
  int b = int.parse(stdin.readLineSync()!);
  int sum = a + b;
  print("sum = $sum");
}
