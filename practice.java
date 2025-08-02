import java.util.*;

public class practice {

    // public static void printName(String name) {
    // System.out.println("Hello, " + name + "!");
    // }

    // public static int printSquare(int n) {
    // // int square = n * n;
    // // System.out.println(square);
    // return n * n;
    // }

    // public static void numberCheck(int n) {
    // if (n % 2 == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");
    // }
    // }

    // public static void printTable(int n) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(n + " x " + i + " = " + n * i);
    // }
    // }

    // public static int findMin(int a, int b, int c) {
    // int min;
    // if (a < b && a < c) {
    // min = a;
    // System.out.println(min + " is minimum");
    // } else if (b < a && b < c) {
    // min = b;
    // System.out.println(min + " is minimum");
    // } else {
    // min = c;
    // System.out.println(min + " is minimum");
    // }
    // return min;
    // }

    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // if (n <= 1)
    // return false;
    // for (int i = 2; i <= n / 2; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static int factorial(int n) {
    // int factorial = 1;
    // for (int i = 1; i <= n; i++) {
    // factorial = factorial * i;
    // }
    // return factorial;
    // }

    // public static int reverse(int n) {
    // int orignal = n;
    // int rev = 0;
    // while (n > 0) {
    // int last = n % 10;
    // n = n / 10;
    // rev = rev * 10 + last;
    // }
    // return rev;
    // }

    // public static int palindrome(int n) {
    // int orignal = n;
    // int palindrome = 0;
    // while (n > 0) {
    // int last = n % 10;
    // n = n / 10;
    // palindrome = palindrome * 10 + last;
    // }
    // if (orignal == palindrome) {
    // System.out.println(orignal + " is Palindrome");
    // } else {
    // System.out.println(orignal + " is not Palindrome");
    // }
    // return orignal;
    // }

    // public static int digitCount(int n) {
    // int orignal = n;
    // int count = 0;
    // n = Math.abs(n);
    // if (n == 0) {
    // count = 1;
    // } else {
    // while (n > 0) {
    // int last = n % 10;
    // n = n / 10;
    // count++;
    // }
    // }
    // return count;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printName(name);

        // int n = sc.nextInt();
        // System.out.println(printSquare(n));

        // int n = sc.nextInt();
        // numberCheck(n);

        // int n = sc.nextInt();
        // printTable(n);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // findMin(a, b, c);

        // int n = sc.nextInt();
        // if (isPrime(n)) {
        // System.out.println(n + " is prime");
        // } else {
        // System.out.println(n + " is not prime");
        // }

        // int n = sc.nextInt();
        // System.out.println(factorial(n));

        // int n = sc.nextInt();
        // System.out.println(reverse(n));

        // int n = sc.nextInt();
        // palindrome(n);

        // int n = sc.nextInt();
        // System.out.println(digitCount(n));
    }
}
