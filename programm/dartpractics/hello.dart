import 'dart:io';

void main() {
  // Ask the user to input the number of rows
  stdout.write("Enter the number of rows: ");
  int rows = int.parse(stdin.readLineSync()!);

  // Outer loop for each row
  for (int i = 1; i <= rows; i++) {
    // Print spaces
    for (int j = 1; j <= rows - i; j++) {
      stdout.write(" ");
    }
    // Print stars
    for (int k = 1; k <= 2 * i - 1; k++) {
      stdout.write("*");
    }
    // Move to the next line after each row
    print("");
  }
}
