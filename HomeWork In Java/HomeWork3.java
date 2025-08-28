import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture - 10(Arrays Introduction)

        // Q1. Take an array of names as input from the user and print them on the
        // screen.

        // Ans-

        // // Array Size Input
        // System.out.println("Enter size of input: ");
        // int input = sc.nextInt();

        // // Array
        // String name[] = new String[input];

        // // Loop for Input
        // System.out.println("Enter " + input + " multiple names: ");
        // for (int i = 0; i < input; i++) {
        // name[i] = sc.next();
        // }

        // // Loop for Output
        // System.out.println("Here is your names: ");
        // for (int i = 0; i < name.length; i++) {
        // System.out.println((i + 1) + ". " + name[i]);
        // }

        // Q2. Find the maximum & minimum number in an array of integers.
        // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

        // Ans-

        // // Array size Input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int find[] = new int[size];

        // // Loop for input
        // for (int i = 0; i < size; i++) {
        // find[i] = sc.nextInt();
        // }

        // // Max/Min value initialize
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // // Loop for Output
        // for (int i = 0; i < find.length; i++) {
        // if (find[i] < min) {
        // min = find[i];
        // } else if (find[i] > max) {
        // max = find[i];
        // }

        // }

        // // Print
        // System.out.println("Minimum = " + min + "\n" + "Maximum = " + max);

        // Q3. Take an array of numbers as input and check if it is an array sorted in
        // ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.

        // Ans -

        // // Array size input
        // System.out.println("Enter size of input: ");
        // int size = sc.nextInt();

        // // Array
        // int checkOrder[] = new int[size];

        // // Loop for input
        // for (int i = 0; i < size; i++) {
        // checkOrder[i] = sc.nextInt();
        // }

        // // boolean tag
        // boolean isAscending = true;

        // // Checking, is this array in ascending order or not
        // for (int i = 0; i < checkOrder.length - 1; i++) {
        // if (checkOrder[i] > checkOrder[i + 1]) {
        // isAscending = false;
        // }
        // }

        // // Print the result
        // if (isAscending) {
        // System.out.println("The array is shorted in Ascending order");
        // } else {
        // System.out.println("The array is not shorted in Ascending order");
        // }

        // Lecture - 11(2D Arrays)

        // Q1. Print the spiral order matrix as output for a given matrix of numbers.
        // Ex- Spiral order is given by: 1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9
        // 6 10 12 13 20 32 68 63 59 55 25 29 30 29.

        // Ans-

        // //Array size input
        // System.out.println("Enter your rows or columns for array: ");
        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // //Array
        // int[][] matrix = new int[n][m];

        // //Loop for Input
        // //rows
        // System.out.println("Enter your input for array " + n + " rows and " + m +"
        // columns: ");
        // for (int i = 0; i < n; i++){
        // //Column
        // for(int j = 0; j < m; j++){
        // //get row and column input
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // //Initialize
        // int rowStart = 0;
        // int rowEnd = n-1;
        // int colStart = 0;
        // int colEnd = m-1;

        // //Print condition
        // System.out.println("Here is your spiral order: ");
        // while(rowStart <= rowEnd && colStart <= colEnd){
        // //1st row(left to right)
        // for(int col = colStart; col <= colEnd; col++){
        // System.out.print(matrix[rowStart][col] + " ");
        // }
        // rowStart++;

        // //last column(top to bottom)
        // for(int row = rowStart; row <= rowEnd; row++){
        // System.out.print(matrix[row][colEnd] + " ");
        // }
        // colEnd--;

        // //last row(right to left)
        // for(int col = colEnd; col >= colStart; col--){
        // System.out.print(matrix[rowEnd][col] + " ");
        // }
        // rowEnd--;

        // //1st column(bottom to top)
        // for(int row = rowEnd; row >= rowStart; row--){
        // System.out.print(matrix[row][colStart] + " ");
        // }
        // colStart++;

        // System.out.println();
        // }

        // Q2. For a given matrix of N x M, print its transpose.

        // Ans-

        // //Array size input
        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // //Array
        // int transpose[][] = new int[n][m];

        // //Loop for Input
        // //rows
        // for(int i = 0; i < n; i++){
        // //column
        // for(int j = 0; j < m; j++){
        // transpose[i][j] = sc.nextInt();
        // }
        // }
        // //Transpose output(rows turn into column and column turn into rows)
        // //rows
        // for(int j = 0; j < m; j++){
        // //column
        // for (int i = 0; i < n; i++) {
        // System.out.print(transpose[i][j] + " ");
        // }
        // System.out.println();
        // }

    }
}

// AMAN KUMAR PODDAR