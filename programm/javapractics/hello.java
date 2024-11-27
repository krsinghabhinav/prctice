package programm.javapractics;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num = scanner.nextInt();

if(num%2==0){
    System.out.println("prime");
}else{
    boolean isprime= true;
    for(int i=2; i<=num-1; i++){
        if(num%i==0){
            isprime=false;
        }
        
    }
    if(isprime==true){
        System.out.println("prime");
    }else{
        System.out.println("not prime");
    }
}
       

    }
}
