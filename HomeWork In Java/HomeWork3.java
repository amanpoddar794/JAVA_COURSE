import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture - 10(Arrays Introduction)

        // Q1. Take an array of names as input from the user and print them on the
        // screen.

        // Ans-

        // //Array Size Input
        // System.out.print("Enter the size of inputs : ");
        // int size = sc.nextInt();

        // //Array
        // String[] names = new String[size];

        // //Loop for Input
        // System.out.println("Now enter maximum " + size + " diffrents names : ");
        // for (int i = 0; i < size; i++) {
        // names[i] = sc.next();
        // }
        // System.out.println();

        // //Loop for Output
        // System.out.println("Here is your name output: ");
        // for (int i = 0; i < names.length; i++) {
        // System.out.println("Name" + (i+1) + " is " + names[i]);
        // }

        // Q2. Find the maximum & minimum number in an array of integers.
        // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

        // Ans-

        // //Array size Input
        // System.out.print("Enter the size of inputs : ");
        // int size = sc.nextInt();

        // //Array
        // int num[] = new int[size];

        // //Loop for input
        // System.out.println("Now enter maximum " + size + " diffrents names : ");
        // for (int i = 0; i < size; i++) {
        // num[i] = sc.nextInt();
        // }

        // //Max/Min value initialize
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // //Loop for Output
        // for (int i = 0; i < num.length; i++) {
        // if(num[i] < min){
        // min = num[i];
        // }else if(num[i] > max){
        // max = num[i];
        // }
        // }

        // //Print
        // System.out.println("Largest number is : " + max);
        // System.out.println("Smallest number is : " + min);

        // Q3. Take an array of numbers as input and check if it is an array sorted in
        // ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // {3, 4, 6, 2} is not sorted in ascending order.

        // Ans -

        // //Array size input
        // System.out.print("Enter the size of inputs : ");
        // int size = sc.nextInt();

        // //Array
        // int num[] = new int[size];

        // //Loop for input
        // System.out.println("Now enter maximum " + size + " diffrents names : ");
        // for (int i = 0; i < size; i++) {
        // num[i] = sc.nextInt();
        // }

        // //boolean tag
        // boolean isAscending = true;

        // //Checking, is this array in ascending order or not
        // for (int i = 0; i < num.length-1; i++){
        // if(num[i] > num[i+1]){
        // isAscending = false;
        // }
        // }

        // //Print the result
        // if(isAscending){
        // System.out.println("The array is sorted in ascending order");
        // }else{
        // System.out.println("The array is not sorted in ascending order");
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