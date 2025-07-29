import java.util.*;
public class ArraysOr2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


                            // Lecture - 10(Arrays Introduction)


        // int[] marks = new int[3]; // int marks[] = new int[3];
        // marks[0] = 76; //phy
        // marks[1] = 73; //che
        // marks[2] = 65; //math

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[0] + marks[1] + marks[2]); // isse sara marks add hoo gya 

        // for (int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        // }
        

        //      //Array size input
        // System.out.print("Enter the size of inputs : ");
        // int size = sc.nextInt();

        //      //Array
        // int num[] = new int[size];

        //      //Loop for input
        // System.out.println("Now enter maximum " + size + " diffrent numbers : ");
        // for (int i = 0; i < size; i++) {
        //     num[i] = sc.nextInt();
        // }

        //      //Output
        // System.out.println("Here is your output: ");
        // for (int i = 0; i < size; i++) {
        //     System.out.println(num[i]);
        // }



        //      //Array size input
        // System.out.println("Enter the size of inputs: ");
        // int size = sc.nextInt();

        //      //Array
        // int num[] = new int[size];

        //      //Loop for input
        // System.out.println("Now enter maximum " + size + " diffrents numbers : ");
        // for (int i = 0; i < size; i++) {
        //     num[i] = sc.nextInt();
        // }

        //      //which number you want to find
        // System.out.print("Enter which number want to find at index: ");
        // int x = sc.nextInt();
        // System.out.println();

        //      //Searching in array's input to find x
        // for(int i = 0; i < num.length; i++){
        //     if(num[i] == x){
        //         System.out.println("Here is your output: ");
        //         System.out.println("x found at index :" + i);
        //     }
        // }

        
                            // Lecture - 11(2D Arrays)


        //         //Input
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        //         //2D Array
        // int[][] num = new int[rows][cols];

        //         //Input for array
        //         //rows
        // for (int i = 0; i < rows; i++) {
        //         //columns
        //     for (int j = 0; j < cols; j++) {
        //         num[i][j] = sc.nextInt();
        //     }
        // }

        //         //Output
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++) {
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        //         //Input
        // System.out.println("Enter your rows or columns for array: ");
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();

        //         //2D Array
        // int[][] num = new int[rows][cols];

        //         //Input for array
        //         //rows
        // System.out.println("Enter your input for array " + rows + " rows and " + cols +" columns: ");
        // for (int i = 0; i < rows; i++) {
        //         //columns
        //     for(int j = 0; j < cols; j++){
        //         num[i][j] = sc.nextInt();
        //     }
        // }

        //         //Find number
        // System.out.print("Enter which number search in array: ");
        // int x = sc.nextInt();

        //         //Output
        // for (int i = 0; i < rows; i++) {
        //     for(int j = 0; j < cols; j++){
        //         //conditions
        //         if(num[i][j] == x){
        //             System.out.println("Here is your output: ");
        //             System.out.println("x found at index location: " +"( " + i + "," + j + " )");
        //         }
        //     }
        // }
        

                            //Practice question(Array) from chat-gpt

        
        //Q1. Find maximum element.

        // int size = sc.nextInt();

        // int maximum[] = new int[size];

        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < size; i++) {
        //     maximum[i] = sc.nextInt();
        // }

        // for (int i = 0; i < maximum.length; i++) {
        //     if(maximum[i] > max){
        //         max = maximum[i];
        //     }
        // }
        // System.out.println(max);


        //Q2. Calculate sum of all element.

        // int size = sc.nextInt();

        // int[] calculate = new int[size];

        // for (int i = 0; i < size; i++){
        //   calculate[i] = sc.nextInt();
        // }

        // int sum = 0;

        // for (int i = 0; i < size; i++) {
        //     sum = sum + calculate[i];
        // }
        // System.out.println(sum);


        //Q3. Count even and odd numbers.

        // int n = sc.nextInt();

        // int[] check = new int[n];

        // for(int i = 0; i < n; i++){
        //     check[i] = sc.nextInt();
        // }

        // int even = 0;
        // int odd = 0;

        // for(int i = 0; i < n; i++){
        //     if(check[i] % 2 == 0){
        //         even++;
        //     }else{
        //         odd++;
        //     }
        // }
        // System.out.println("Even: " + even + ", " + "Odd: " + odd);


        //Q4. Reverse the array.

        // int n = sc.nextInt();

        // int[] reverse = new int[n];

        // for(int i = 0; i < n; i++){
        //     reverse[i] = sc.nextInt();
        // }

        // int start = 0;
        // int end = reverse.length-1;

        // while(start < end){
        //     int temp = reverse[start];
        //     reverse[start] = reverse[end];
        //     reverse[end] = temp;

        //     start++;
        //     end--;
        // }
        // System.out.println("Reversed array is: ");
        // for(int num : reverse){
        //     System.out.print(num + " ");
        // }
        

        //Q5. Check if Array is Sorted(ascending order) or Not.

        // int n = sc.nextInt();

        // int ascending[] = new int[n];

        // for (int i = 0; i < n; i++) {
        //     ascending[i] = sc.nextInt();
        // }

        // boolean isAscending = true;

        // for (int i = 0; i < ascending.length-1; i++) {
        //     if(ascending[i] > ascending[i+1]){
        //         isAscending = false;
        //     }
        // }

        // if(isAscending){
        //     System.out.println("Your array is sorted(ascending order): ");
        // }else{
        //     System.out.println("Your array is not sorted(ascending order): ");
        // }


        //Q6. Find Second Largest Element.

        // int n = sc.nextInt();

        // int secLarge[] = new int[n];

        // for (int i = 0; i < n; i++) {
        //     secLarge[i] = sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE;
        // int max2 = Integer.MIN_VALUE;

        // for(int num : secLarge){ // ek blank int create kiye num naam se
        //     if(num > max){ // iss num me secLarge[i] ka value add hota jayega or
        //                    // agar num max se chota hua toh fir next number add hoga or num bda hua toh max update hoo jayega or old max max2 bn jayega
        //         max2 = max; // old max max2 bnn gya or max update hoo gya
        //         max = num;  // max update hoo ke num ka value add hoo jayega
        //     }else if (num > max2 && num != max) {  // Agar element max se to chhota hai, lekin max2 se bada hai:
        //                                            // To wo max2 banega.
        //                                            // 'num != max' ka matlab hai hum duplicate largest number ko ignore kar rahe hain.
        //         max2 = num;
        //     }
        // }

        // if(max2 == Integer.MIN_VALUE){  // Agar max2 kabhi update hi nahi hua, to iska matlab array me second largest element hai hi nahi. Eg:- (20,20,20)
        //     System.out.println("Second largest number is doesn't exist");
        // }else{  // or agar max2 ek v baar update hua hoga toh max2 print hoo jayega
        //     System.out.println("Here is your second largest number: " + max2);
        // }



        //Q7. Remove Duplicates from Array (Assume sorted array).

        // int n = sc.nextInt();

        // int[] removeDuplicate = new int[n];

        // for(int i = 0; i < n; i++){
        //     removeDuplicate[i] = sc.nextInt();
        // }

        // int duplicate = 0;

        // for(int num :removeDuplicate){
        //     if(num > duplicate){
        //         duplicate = num;
        //     }
        //     // if(num != duplicate){
        //     //     duplicate = num;
        //     // }
        // }

        // System.out.println(duplicate);
        // // if(duplicate == Integer.SIZE){
        // //     System.out.println();
        // // }else{
        // //     System.out.println(duplicate);
        // // }



                            //Practice question(2D Array) from chat-gpt 


        //Q1. Print 2D array.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int [][] twoD = new int[n][m];

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++){
        //         twoD[i][j] = sc.nextInt();
        //     }   
        // }

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++){
        //         System.out.print(twoD[i][j] + " ");
        //     }
        // System.out.println();
        // }


        //Q2. Sum of All Elements in 2D Array.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] sum = new int[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         sum[i][j] = sc.nextInt();
        //     }
        // }

        // int sumOfNumber = 0;

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++){
        //         sumOfNumber = sumOfNumber + sum[i][j];
        //     }
        // }
        // System.out.print(sumOfNumber + " ");


        //Q3. Print Diagonal Elements.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] diagonal = new int[n][m];

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++){
        //         diagonal[i][j] = sc.nextInt();
        //     }   
        // }

        // int matrix = diagonal.length;

        // System.out.print("Diagonal Emlment of matrix: ");
        // for(int i = 0; i < matrix; i++){
        //     System.out.print(diagonal[i][i] + " ");
        // }
        // System.out.println();


        //Q4. Transpose of matrix.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int transpose[][] = new int[n][m];

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++){
        //         transpose[i][j] = sc.nextInt();
        //     }
        // }

        // for(int j = 0; j < m; j++){
        //     for(int i = 0; i < n; i++){
        //         System.out.print(transpose[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        //Q5. Search an Element in 2D Array.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] search = new int[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         search[i][j] = sc.nextInt();
        //     }
        // }

        // int x = sc.nextInt();

        // for (int i = 0; i < search.length; i++) {
        //     for(int j = 0; j < search.length; j++){
        //         if(x == search[i][j]){
        //             System.out.print(x + " found at index location:- " + i +", "+ j);
        //         }
        //     }   
        // }


        //Q6. Find Row with Maximum Sum.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // int[][] maxRowSum = new int[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         maxRowSum[i][j] = sc.nextInt();
        //     }
        // }

        // int maxSum = Integer.MIN_VALUE;
        // int maxrowIndex = -1;

        // for(int i = 0; i < maxRowSum.length; i++){
        //     int rowSum = 0;
        //     for(int j = 0; j < maxRowSum[i].length; j++){
        //         rowSum += maxRowSum[i][j];
        //     }
        //     if(rowSum > maxSum){
        //         maxSum = rowSum;
        //         maxrowIndex = i;
        //     }
        // }

        // System.out.println("Maximum row sum find in at " + maxrowIndex + " index.");
        // System.out.println("Maximun Number is: " + maxSum);



                            //Practice Question


        //Q1. Print rectangle.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // char[][] rectangle = new char[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         rectangle[i][j] = '*';
        //     }
        // }
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         System.out.print(rectangle[i][j]);
        //     }
        //     System.out.println();
        // }


        //Q2. Print hollow rectangle.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // char[][] hollowRectangle = new char[n][m];

        // // for(int i = 0; i < n; i++){
        // //     for(int j = 0; j < m; j++){
        // //         hollowRectangle[i][j] = sc.nextInt();
        // //     }
        // // }

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(i==0 || j==0 || i==n-1 || j==m-1){
        //             // System.out.print("* ");
        //             hollowRectangle[i][j] = '*';
        //         }else{
        //             // System.out.print(" ");
        //             hollowRectangle[i][j] = ' ';
        //         }
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     for(int j = 0; j < m; j++){
        //         System.out.print(hollowRectangle[i][j]);
        //     }   
        //     System.out.println();
        // }


        //Q3. Print half pyramid.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // char[][] halfPyramid = new char[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         // if(j <= i){
        //             halfPyramid[i][j] = '*';
        //         // }else{
        //         //     halfPyramid[i][j] = ' ';
        //         // }
        //     }
        // }

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print(halfPyramid[i][j]);
        //     }
        //     System.out.println();
        // }


        //Q4. Print Inverted half pyramid.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // char[][] invertedHalfPyramid = new char[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n-i; j++){
        //         // if(j <= i){
        //             invertedHalfPyramid[i][j] = '*';
        //         // }else{
        //         //     invertedHalfPyramid[j][i] = ' ';
        //         // }
        //     }
        // }

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n-i; j++){
        //         System.out.print(invertedHalfPyramid[i][j]);
        //     }
        //     System.out.println();
        // }


        //Q5. Print half pyramid its horinzoltily rotate by 180deg.

        // int n = sc.nextInt();
        // int m = sc.nextInt();

        // char[][] rotatedHalfPyramid = new char[n][m];

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(j < n-i-1){
        //             rotatedHalfPyramid[i][j] = ' ';
        //         }else{
        //             rotatedHalfPyramid[i][j] = '*';
        //         }
        //     }
        // }

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         System.out.print(rotatedHalfPyramid[i][j]);
        //     }
        //     System.out.println();
        // }


        //Q6. Print Inverted half pyramid its horizontily rotate by 180 deg.

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] invertedRotatedHalfPyramid = new char[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                if(j < n-i-1){
                    invertedRotatedHalfPyramid[i][j] = ' ';
                }else{
                    invertedRotatedHalfPyramid[i][j] = '*';
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(invertedRotatedHalfPyramid[i][j]);
            }
            System.out.println();
        }


    }
}
