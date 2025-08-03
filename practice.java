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

    // public static int findGCD(int a, int b) {
    // int gcd = 1;
    // Math.min(a, b);
    // for (int i = 1; i <= Math.min(a, b); i++) {
    // if (a % i == 0 && b % i == 0) {
    // gcd = i;
    // }
    // }
    // System.out.println("GCD of " + a + " and " + b + " is " + gcd);
    // return gcd;
    // }

    // public static int armstrong(int n) {
    // int orignal = n;
    // int digit = 0;
    // int sum = 0;
    // while (n > 0) {
    // int last = n % 10;
    // n = n / 10;
    // digit = last * last * last;
    // sum = digit + sum;
    // // System.out.println(digit);
    // }
    // if (orignal == sum) {
    // System.out.println(orignal + " is Armstrong");
    // } else {
    // System.out.println(orignal + " is not Armstrong");
    // }
    // return orignal;
    // }

    // public static void printPrimes(int n) {
    // for (int i = 2; i <= n; i++) {
    // boolean isPrime = true;
    // for (int j = 2; j < i; j++) {
    // if (i % j == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // if (isPrime) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // public static void digitSum(int n) {
    // int sum = 0;
    // while (n > 0) {
    // int last = n % 10;
    // n = n / 10;
    // sum = last + sum;
    // }
    // System.out.println(sum);
    // return;
    // }

    // public static void printFibonacci(int n) {
    // int first = 0;
    // int second = 1;
    // int next = 0;
    // System.out.print(first + " ");
    // System.out.print(second + " ");
    // for (int i = 1; i <= n - 2; i++) {
    // next = first + second;
    // System.out.print(next + " ");
    // first = second;
    // second = next;
    // }
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

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // findGCD(a, b);

        // int n = sc.nextInt();
        // armstrong(n);

        // int n = sc.nextInt();
        // printPrimes(n);

        // int n = sc.nextInt();
        // digitSum(n);

        // int n = sc.nextInt();
        // printFibonacci(n);
    }
}
