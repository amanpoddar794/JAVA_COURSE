
import java.util.*;

public class SecondClass {

                    // Lecture - 7 (Function & Methods)

    // public static int calculateSum(int n){
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         sum = sum + i;
    //     }
    //     return sum;
    // }

    // public static int printTable(int n){
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(n + " x " + i + " = " + (n*i));
        // }
        // int sum = 0;
        // for (int i =  1; i <= n; i++) {
        //     if(i % 2 == 0){
        //         sum = sum + i;
        //         // System.out.println();
        //     }
        // }
        // System.out.println(sum);
        // return 0;
    // }

    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static void checkEvenOrOdd(int n){
    //     if(n % 2 == 0){
    //         System.out.println(n + " is Even");
    //     }else{
    //         System.out.println(n + " is Odd");
    //     }
    //     return;
    // }

    // public static void checkFactorial(int n){
    //     int factorial = 1;
    //     for (int i = n; i >= 1; i--) {
    //        factorial = factorial * i; 
    //     }
    //     System.out.println(factorial);
    //     return;
    // }

    // public static boolean isPrime(int n){
        
    //     if(n <= 1) return false; // 0 and 1 are not prime 

        
    //     for(int i = 2; i <= n/2; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static int maxOfNumber(int a, int b, int c){
    //     if(a >= b && a >= c){
    //         return a;
    //     }else if(b >= a && b >= c){
    //         return b;
    //     }else{
    //         return c;
    //     }
    // }

    // public static int getPower(int a, int b){
    //     int result = 1;
    //     for(int i = 1; i <= b; i++){
    //         result = result * a;
    //     }
    //     return result;
    // }

    // public static String reverseString(String name){
    //     String reversed = "";
    //     for(int i = name.length() - 1; i >= 0; i--){
    //         reversed = reversed + name.charAt(i);
    //     }
    //     return reversed;
    // }
    

                    // Lecture - 8 (Isme 10 question diya gya hai jo HomeWork me hai)
                    // Lecture - 9 (Basics of Time Complexity and Space Complexity )

    // public static
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

                    // Lecture - 7 (Function & Methods)

        // System.out.print("Enter your num :");
        // int n = sc.nextInt();
        // // System.out.println(calculateSum(n));
        // // System.out.println();

        // printTable(n);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(calculateSum(a, b));

        // int n = sc.nextInt();
        // checkEvenOrOdd(n);
        
        // int n = sc.nextInt();
        // checkFactorial(n);

        // System.out.println("Enter a number to check if it is prime or not:");
        // int n = sc.nextInt();
        
        // if(n == 1){
        //     System.out.println("1 is neither prime nor composite");
        //     return;
        // }
        // if(isPrime(n)){
        //         System.out.println(n + " is a Prime Number");
        // }else{
        //         System.out.println(n + " is not a Prime Number");
        //     }
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Maximum : " + maxOfNumber(a, b, c));

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a + " raised to power " + b + " : " + getPower(a, b));

        // String name = sc.nextLine();
        // System.out.println(reverseString(name));

        //Q7. Write a program to enter the numbers till the user wants and at the end it
            // should display the count of positive, negative and zeros entered. 

        // int positive = 0, negetive = 0, zero = 0;
        // System.out.println("press 1 for continue and 0 for stop :");
        // int input = sc.nextInt();
        
        // while(input == 1){
        //     System.out.println("Enter you number : ");
        //     int number = sc.nextInt();
        //     if(number > 0){
        //         positive++; // positive = positive + 1;
        //     }else if(number < 0){
        //         negetive++; // negetive = negetive + 1;
        //     }else{
        //         zero++; // zero = zero + 1;
        //     }

        //     System.out.println("press 1 for continue and 0 for stop :");
        //     input = sc.nextInt();
        // }

        // System.out.println("Positive : " + positive);
        // System.out.println("Negetive : " + negetive);
        // System.out.println("Zeros : " + zero);


    }
    
}
