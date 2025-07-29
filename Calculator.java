import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Action Buttons

        // int button = sc.nextInt();
        char button = sc.next().charAt(0);
        switch (button) {

            case '+':
                double sum = a + b;
                System.out.println(sum);
                break;

            case '-':
                double sub = a - b;
                System.out.println(sub);
                break;

            case '*':
                double mul = a * b;
                System.out.println(mul);
                break;

            case '/':
                double div = a / b;
                if (a == 0) {
                    System.out.println("Invalid answer");
                } else {
                    // System.out.println("Your answer is here :");
                    System.out.println(div);
                }
                break;

            case '%':
                double mod = a % b;
                System.out.println(mod);
                break;
        }
    }
}
