import 'dart:io';

void main() {
  stdout.write("Enter the status");
  String? status = stdin.readLineSync();
  String? mess = checkOutStatus(status!);
  print(mess);
}

String? checkOutStatus(String status) {
  return (status == "pending")
      ? "order pending"
      : (status == "deliver")
          ? "Order deliver"
          : (status == "cancelOrder")
              ? "orderCancel"
              : "order is not valide";
}
