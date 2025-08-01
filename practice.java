import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.print(a * i + " ");
        // }

        // // int factorial = 1;
        // // for (int i = 1; i <= a; i++) {
        // // factorial = factorial * i;
        // // }
        // int factorial = 1;
        // while (a > 0) {
        // int dec = a--;
        // factorial = factorial * dec;
        // }
        // System.out.println(factorial);

        // // int sum = 0;
        // // for (int i = 1; i <= a; i++) {
        // // sum = sum + i;
        // // }
        // while (a > 0) {
        // int num = a--;
        // sum = sum + num;
        // }
        // System.out.println(sum);

        // // int orignal = a;
        // // int rev = 0;
        // // while (a > 0) {
        // // int lastDigit = a % 10;
        // // a = a / 10;
        // // rev = rev * 10 + lastDigit;
        // // }
        // do {
        // int lastDigit = a % 10;
        // a = a / 10;
        // rev = rev * 10 + lastDigit;
        // } while (a > 0);
        // System.out.println(rev);

        // int orignal = a;
        // int count = 0;
        // a = Math.abs(a);
        // if (a == 0) {
        // count = 1;
        // } else {
        // while (a > 0) {
        // int lastDigit = a % 10;
        // a = a / 10;
        // count++;
        // }
        // }
        // System.out.println(count);

        // int orignal = a;
        // int rev = 0;
        // while (a > 0) {
        // int lastDigit = a % 10;
        // a = a / 10;
        // rev = rev * 10 + lastDigit;
        // }
        // if (orignal == rev) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int num = 1;
        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int sp = a - i; sp > 0; sp--) {
        // System.out.print(" ");
        // }
        // int num = 1;
        // for (int j = 0; j < i; j++) {
        // System.out.print(num + " ");
        // num = num * (i - 1 - j) / (j + 1);
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (a - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = a - 1; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (a - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int orignal = a;
        // int num = 0;
        // int add = 0;
        // while (a > 0) {
        // int lastDigit = a % 10;
        // a = a / 10;
        // num = lastDigit * lastDigit * lastDigit;
        // add = num + add;
        // }
        // if (orignal == add) {
        // System.out.println("Armstrong");
        // } else {
        // System.out.println("Not Armstrong");
        // }

        // for (int i = 1; i <= a; i++) {
        // for (int j = a - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = a - 1; i >= 1; i--) {
        // for (int j = a - i; j >= 1; j--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int b = sc.nextInt();
        // int gcd = 1;
        // Math.min(a, b);
        // for (int i = 1; i < +Math.min(a, b); i++) {
        // if (a % i == 0 && b % i == 0) {
        // gcd = i;
        // }
        // }
        // System.out.println(gcd + " is the GCD of " + a + " " + b);
    }
}
