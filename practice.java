import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] marks = new int[3];
        // marks[0] = 78; // phy
        // marks[1] = 93; // math
        // marks[2] = 85; // che
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        // int marks[] = { 78, 93, 85 };
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);
        // }

        // int size = sc.nextInt();
        // int[] num = new int[size];

        // for (int i = 0; i < size; i++) {
        // num[i] = sc.nextInt();
        // }

        // int x = sc.nextInt();
        // for (int i = 0; i < num.length; i++) {
        // if (num[i] == x) {
        // System.out.println(x + " found at " + i + " index");
        // }
        // }

        // Array 1D Practice Questions

        // Q1. Create an array of 10 integers.
        // Take input from the user and display the array in reverse order.

        // Ans-

        // // Array size input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int reverse[] = new int[size];

        // // Input for array
        // System.out.println("Enter " + size + " diffrent number:");
        // for (int i = 0; i < size; i++) {
        // reverse[i] = sc.nextInt();
        // }

        // // Create reverse
        // int num = 0;
        // // int rev = 0;
        // for (int i = reverse.length - 1; i >= 0; i--) {
        // num = reverse[i];
        // System.out.println(num);
        // }

        // Q2. Take input of 5 integers and find the sum and average of
        // all elements using array.

        // Ans-

        // // Array Size Input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int input[] = new int[size];

        // // Input for array
        // System.out.println("Enter " + size + " diffrent number:");
        // for (int i = 0; i < size; i++) {
        // input[i] = sc.nextInt();
        // }

        // // Calculate average
        // int average = 0;
        // for (int i = 0; i < input.length; i++) {
        // average = average + input[i];
        // }

        // // Output
        // System.out.print("This is the output:- ");
        // System.out.println(average / size);

        // Q3. Write a program to find the maximum and minimum
        // number from a user-input array.

        // Ans-

        // // Array Size input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int check[] = new int[size];

        // // Input for array
        // System.out.println("Enter " + size + " diffrent number:");
        // for (int i = 0; i < size; i++) {
        // check[i] = sc.nextInt();
        // }

        // // Find Minimum & Maximum
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < check.length; i++) {
        // if (check[i] > max) {
        // max = check[i];
        // }
        // if (check[i] < min) {
        // min = check[i];
        // }
        // }

        // // Output
        // System.out.println("Maximum:- " + max + "\n" + "Minimum:- " + min);

        // Q4. Count how many even and odd numbers
        // are present in an array of size N.

        // Ans-

        // // Array Size input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int find[] = new int[size];

        // // Input for Array
        // System.out.println("Enter " + size + " diffrent number:");
        // for (int i = 0; i < size; i++) {
        // find[i] = sc.nextInt();
        // }

        // // Find Odd & Even
        // int odd = 0;
        // int even = 0;

        // for (int i = 0; i < find.length; i++) {
        // if (find[i] % 2 == 0) {
        // even++;
        // } else {
        // odd++;
        // }
        // }

        // // Output
        // System.out.println("Even:- " + even + "\n" + " Odd:- " + odd);

        // Q5. Check if a given number exists in the array or not.

        // Ans-

        // // Array Size input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int findDigit[] = new int[size];

        // // Input for array
        // for (int i = 0; i < size; i++) {
        // findDigit[i] = sc.nextInt();
        // }

        // // Finder Number
        // System.out.println("Enter number you want to find..!!");
        // int finder = sc.nextInt();

        // // Find Digit
        // boolean found = false;
        // for (int i = 0; i < findDigit.length; i++) {
        // if (findDigit[i] == finder) {
        // found = true;
        // break;
        // }
        // }

        // // Output
        // if (found) {
        // System.out.println("Yes, This " + finder + " is exist.");
        // } else {
        // System.out.println("No, This " + finder + " is not exist.");
        // }
    }
}
