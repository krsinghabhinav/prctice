package programm.javapractics;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        int sum= a+b;
        System.out.println("sum = "+sum);
    }
    
}
