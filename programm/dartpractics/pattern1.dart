import 'dart:io';

void main() {
  stdout.write("Enter the number of rows");
  int rows = int.parse(stdin.readLineSync()!);

  for (int i = 1; i <= rows; i++) {
    for (int j = rows; j >= i; j--) {
      stdout.write("$j ");
    }
    print(" ");
  }
}
