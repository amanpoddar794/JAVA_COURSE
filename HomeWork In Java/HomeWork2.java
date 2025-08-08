import java.util.*;

public class HomeWork2 {

    // Lecture - 7 {Function and Method}

    // Q1. Make a function to check if a number is prime or not.

    // Ans -

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

    // Q2. Make a function to check if a given number n is even or not.

    // Ans -

    // public static void numberCheck(int n) {
    // if (n % 2 == 0) {
    // System.out.println(n + " is Even");
    // } else {
    // System.out.println(n + " is Odd");
    // }
    // }

    // Q3. Make a function to print the table of a given number n.

    // Ans -

    // public static void printTable(int n) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(n + " x " + i + " = " + n * i);
    // }
    // }

    // Lecture - 8 {Function in Java(Practice Questions)}

    // Q1. Enter 3 numbers from the user & make a function to print their average.

    // Ans -

    // public static int printAverage(int a, int b, int c) {
    // return (a + b + c) / 3;
    // }

    // Q2. Write a function to print the sum of all odd numbers from 1 to n.

    // Ans -

    // public static void oddSum(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // if (i % 2 != 0) {
    // sum = sum + i;
    // }
    // }
    // System.out.println(sum);
    // }

    // Q3. Write a function which takes in 2 numbers and returns the greater of
    // those two.

    // Ans -

    // public static void printGreater(int a, int b) {
    // if (a > b) {
    // System.out.println(a + " is greater");
    // } else {
    // System.out.println(b + " is greater");
    // }
    // }

    // Q4. Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    // Ans -

    // public static double circumference(double radius) {
    // double circumference = 2 * Math.PI * radius;
    // return circumference;
    // }

    // Q5. Write a function that takes in age as input and returns if that person is
    // eligible to vote or not.
    // A person of age > 18 is eligible to vote.

    // Ans -

    // public static void ageChack(int n) {
    // if (n >= 18) {
    // System.out.println("You are Eligible");
    // } else {
    // System.out.println("You are not Eligible");
    // }
    // }

    // Q6. Write an infinite loop using do while condition.

    // Ans -

    // public static void infinite(int n) {
    // do {
    // System.out.println("Hello, Aman!");
    // } while (n != 0);
    // }

    // Q7. Write a program to enter the numbers till the user wants and at the end
    // it should display the count of positive, negative and zeros entered.

    // Ans -

    // iska answer niche hai

    // Q8. Two numbers are entered by the user, x and n. Write a function to find
    // the value of one number raised to the power of another i.e. x^n.

    // Ans -

    // public static double getSquare(int x, int n) {
    // double square = Math.pow(x, n);
    // return square;
    // }

    // Q9. Write a function that calculates the Greatest Common Divisor of 2
    // numbers.

    // Ans -

    // public static int fingGCD(int a, int b) {
    // int gcd = 1;
    // Math.min(a, b);
    // for (int i = 1; i < Math.min(a, b); i++) {
    // if (a % i == 0 && b % i == 0) {
    // gcd = i;
    // }
    // }
    // return gcd;
    // }

    // Q10. Write a program to print Fibonacci series of n terms where n is input by
    // user :
    // 0 1 1 2 3 5 8 13 21 .....
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that
    // came before it.

    // Ans -

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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Lecture - 7 {Function and Method}

        // Q1.

        // Ans -

        // int n = sc.nextInt();
        // if (isPrime(n)) {
        // System.out.println(n + " is Prime");
        // } else {
        // System.out.println(n + " is not Prime");
        // }

        // Q2.

        // Ans -

        // int n = sc.nextInt();
        // numberCheck(n);

        // Q3.

        // Ans -

        // int n = sc.nextInt();
        // printTable(n);

        // Lecture - 8 {Function in Java(Practice Questions)}

        // Q1.

        // Ans -

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(printAverage(a, b, c));

        // Q2.

        // Ans -

        // int n = sc.nextInt();
        // oddSum(n);

        // Q3.

        // Ans -

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // printGreater(a, b);

        // Q4.

        // Ans -

        // double radius = sc.nextInt();
        // System.out.println(circumference(radius));

        // Q5.

        // Ans -

        // int n = sc.nextInt();
        // ageChack(n);

        // Q6.

        // Ans -

        // int n = sc.nextInt();
        // infinite(n);

        // Q7.

        // Ans -

        // System.out.println("Press 1 to continue and 0 for start: ");
        // int i = sc.nextInt();
        // int positive = 0;
        // int negative = 0;
        // int zeros = 0;
        // if (i == 1) {
        // do {
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // if (n > 0) {
        // positive++;
        // } else if (n < 0) {
        // negative++;
        // } else {
        // zeros++;
        // }
        // System.out.println("Press 1 to continue and 0 for start: ");
        // i = sc.nextInt();
        // } while (i != 0);
        // sc.close();
        // } else {
        // System.out.println("Thanku You!!");
        // }
        // System.out.println("Positive: " + positive);
        // System.out.println("Negative: " + negative);
        // System.out.println("Zeros: " + zeros);

        // Q8.

        // Ans -

        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // System.out.println(getSquare(x, n));

        // Q9.

        // Ans -

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("GCD of " + a + " & " + b + " is:" + fingGCD(a, b));

        // Q10.

        // Ans -

        // int n = sc.nextInt();
        // printFibonacci(n);
    }
}
