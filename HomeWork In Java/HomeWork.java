
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Lecture - 1  to  Lecture - 6


        //  Lecture - 1


            //    No HomeWork  


        //  Lecture - 2 (Variables in Java)


            // Q1. Try to declare meaningful variables of each type.
            //     Eg - a variable named age should be a numeric type (int or float) not byte.

              //Ans:-

                // // Numric Types

                //     int age = 25; // Age is typically stored as an integer  
                //     double salary = 50000.75; // Salary with decimal values  
                //     float height = 5.9f; // Height in feet  
                //     long population = 8000000000L; // Large number for world population  
                //     short year = 2024; // Year fits in short range  
                //     byte month = 4; // Month (1-12) fits within byte range  
        

                // // Characters & Strings Types
        
                //     char grade = 'A'; // Grade in an exam  
                //     String name = "Devashish"; // Name of a person  

            
                // // Boolean Types

                //     boolean isStudent = true; // True if the person is a student  
                //     boolean hasLicense = false; // False if the person doesn't have a driving license  


                // // Array Types 

                //     int[] marks = {85, 90, 78}; // Array of marks in subjects  
                //     String[] cities = {"Delhi", "Mumbai", "Kolkata"}; // List of city names  
                

                // // Object Types 

                //     LocalDate currentDate = LocalDate.now(); // Stores today's date  
                //     BigDecimal accountBalance = new BigDecimal("1234567.89"); // Stores precise monetary values  



            // Q2. Make a program that takes the radius of a circle as input, 
            //     calculates its radius and area and prints it as output to the user.
                
              //Ans:- 

                // // Taking radius as input
                // System.out.print("Enter the radius of the circle: ");
                // double radius = sc.nextDouble();

                // // Calculating circumference and area
                // double circumference = 2 * Math.PI * radius;
                // double area = Math.PI * Math.pow(radius, 2);

                // // Displaying results
                // System.out.println("Circumference of the circle: " + circumference);
                // System.out.println("Area of the circle: " + area);
                // sc.close();
            

            // Q3.Make a program that prints the table of a number that is input by the user. 

                 // (HINT - You will have to write 10 lines for this but as we proceed in the course 
                 // you will be studying about ‘LOOPS’ that will simplify your work A LOT!)

              //Ans:-   

                        	// Method 1

                // // Taking user input
                // System.out.println("Enter a number: ");
                // int n = sc.nextInt();
              
                // // Printing the multiplication table
                // System.out.println("Multiplication Table of " + n + ":");
                // System.out.println(n + " x 1 = " + (n * 1));
                // System.out.println(n + " x 2 = " + (n * 2));
                // System.out.println(n + " x 3 = " + (n * 3));
                // System.out.println(n + " x 4 = " + (n * 4));
                // System.out.println(n + " x 5 = " + (n * 5));
                // System.out.println(n + " x 6 = " + (n * 6));
                // System.out.println(n + " x 7 = " + (n * 7));
                // System.out.println(n + " x 8 = " + (n * 8));
                // System.out.println(n + " x 9 = " + (n * 9));
                // System.out.println(n + " x 10 = " + (n * 10));
              
                // sc.close();

                            // Method 2 - Using Loop

                // //Taking User Input
                // System.out.println("Enter a number: ");
                // int n = sc.nextInt();
                
                // //Printing The multiplication table
                // System.out.println("Multiplication Table of " + n + ":");
                // for (int i = 1; i <= 10; i++) {
                //     System.out.println(n + " x " + i + " = " + (n * i));
                // }
            
        
        
        // Lecture - 3 (Condistional Statement)
        
            // Q1.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
            //     1 : + (Addition) a + b
            //     2 : - (Subtraction) a - b
            //     3 : * (Multiplication) a * b
            //     4 : / (Division) a / b
            //     5 : % (Modulo or remainder) a % b
            //     Calculate the result according to the operation given and display it to the user.

              //Ans -

                //   // Input

                // int a = sc.nextInt();
                // int b = sc.nextInt();

                //   // Action Buttons

                // int button = sc.nextInt();
                // switch(button){

                //     case 1 : 
                //     int sum = a + b;
                //     System.out.println("Your answer is here" + ":");
                //     System.out.println(sum);
                //     break;

                //     case 2 : 
                //     int sub = a - b;
                //     System.out.println("Your answer is here" + ":");
                //     System.out.println(sub);
                //     break;

                //     case 3 : 
                //     int mul = a * b;
                //     System.out.println("Your answer is here" + ":");
                //     System.out.println(mul);
                //     break;

                //     case 4 :
                //     int div = a / b;
                //     if(a == 0){
                //       System.out.println("Invalid Number");
                //     }else{
                //       System.out.println("Your answer is here :");
                //       System.out.println(div);
                //     }
                //     break;

                //     case 5 :
                //     int mod = a % b;
                //     System.out.println("Your answer is here" + ":");
                //     System.out.println(mod);
                //     break;
                // }

            // Q2. Ask the user to enter the number of the month & print the name of the month.
                //  For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.    

              //Ans-

                //     //  Input 

                // // int n = sc.nextInt();
                // System.out.println("Enter the number of the month: ");

                //     //  Action Buttons

                // int button = sc.nextInt();
                // switch(button){

                //   case 1 :
                //   System.out.println("Answer --->");
                //   System.out.println("January");
                //   break;

                //   case 2 :
                //   System.out.println("Answer --->");
                //   System.out.println("Febuary");
                //   break;

                //   case 3 :
                //   System.out.println("Answer --->");
                //   System.out.println("March");
                //   break;

                //   case 4 :
                //   System.out.println("Answer --->");
                //   System.out.println("April");
                //   break;
                  
                //   case 5 :
                //   System.out.println("Answer --->");
                //   System.out.println("May");
                //   break;

                //   case 6 :
                //   System.out.println("Answer --->");
                //   System.out.println("June");
                //   break;

                //   case 7 :
                //   System.out.println("Answer --->");
                //   System.out.println("July");
                //   break;

                //   case 8 :
                //   System.out.println("Answer --->");
                //   System.out.println("August");
                //   break;

                //   case 9 :
                //   System.out.println("Answer --->");
                //   System.out.println("September");
                //   break;

                //   case 10 :
                //   System.out.println("Answer --->");
                //   System.out.println("October");
                //   break;

                //   case 11 :
                //   System.out.println("Answer --->");
                //   System.out.println("November");
                //   break;

                //   case 12 :
                //   System.out.println("Answer --->");
                //   System.out.println("December");
                //   break;

                //   default :
                //   System.out.println("'Oops' Invalid month number. \n Please enter a number between 1 and 12.");
                // }
        
        
        // Lecture - 4 (Loops in Java)

            // Q1. Print all even number till n.

              //Ans-

                //   //Input
                // System.out.println("Enter a number" + ":");
                // int n = sc.nextInt();
                // System.out.println("Your even number is here till " + n + ":");

                //      //Loop

                // for (int i = 1; i <= n; i++) {
                //     if (i % 2 == 0){
                //       System.out.println(i);
                //     }
                // }
                
                
            // Q2. Run

                      // for (int i = 0; i < 10; i++) {
                      //     System.out.println("Apna College");
                      // }
                  // loop on your system and analyze what happens. Try to think of the reason for the output produced.


            // Q3. Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
                  // If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 

                  // If they enter 0 then stop.

                  // If he/ she scores :

                  // Marks >=90 -> print “This is Good”
                  // 89 >= Marks >= 60 -> print “This is also Good”
                  // 59 >= Marks >= 0 -> print “This is Good as well”

                  //   Because marks don’t matter but our effort does.

                  // (Hint : use do-while loop but think & understand why)

              //Ans-

                // int input;
                // do{

                //     System.out.println("Press 1 for enter your marks or 0 for exit:");
                //     input = sc.nextInt();
                //     if (input == 1) {

                //         //Input
                //       System.out.println("Enter Your Marks out of 100:");
                //       int marks = sc.nextInt();

                //         //Enter Conditions

                //       if(marks >= 90 && marks <= 100){
                //         System.out.println("This is Good");
                //         System.out.println();
                //       }else if (marks >= 60 && marks <= 89) {
                //           System.out.println("This is also Good");
                //           System.out.println();
                //       }else if (marks >= 0 && marks <= 59) {
                //           System.out.println("This is Good as well");
                //           // System.out.println("Because your marks don't matter but your effort does.");
                //           System.out.println();
                //       }else{
                //         System.out.println("Invalid Marks. Please enter a number between 0 and 100.");
                //         System.out.println();
                //       }

                //         //Exit Condition

                //     }else if(input == 0){
                      // System.out.println("Exit \n Thank You!");
                //       System.out.println();
                //     }else{
                //       System.out.println("Invalid Input. Please enter 1 or 0.");
                //       System.out.println();
                //     }
                //   }while(input != 0);
                // sc.close();

            // Bouns Question - 1

              //Qs. Print if a number is prime or not (Input n from the user). 
                  // [In this problem you will learn how to check if a number is prime or not]

                //Ans-

                  //       // Input
                  // System.out.println();
                  // System.out.println("Enter a number to check if it is prime or not:");
                  // int n =sc.nextInt();

                  //       // Loop
                  // boolean isPrime = true;
                  // for (int i = 2; i <= n/2; i++) { 
                  //   if (n % i == 0){
                  //     isPrime = false;
                  //     break;
                  //   }
                  // }
                  //       // Conditions
                  // if (isPrime){
                  //   if (n == 1){
                  //     System.out.println("1 is neither prime nor composite.");
                  //   }else{
                  //     System.out.println(n + " is a prime number.");
                  //   }
                  // }else{
                  //   System.out.println(n + " is not a prime number.");
                  // }


        // Lecture - 5 (Patterns in Java)

            // Q1.Print a solid Rombus.

              //Ans-

                //         //Input
                // int n = sc.nextInt();

                //         // Outer Loop
                // for(int i = 1; i <= n; i++){

                //         //Inner Loop
                //     //1st layer space print
                //     for(int j = 1; j <= n-i; j++){
                //         System.out.print(" ");
                //     }
                //     //2nd layer star print
                //     for(int j = 1; j <= n; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }


            // Q2.Print a number pyramid.

              //Ans- 

                //         //Input
                // int n = sc.nextInt();

                //         // Outer Loop
                // for (int i =  1; i <= n; i++) {

                //         //Inner Loop
                //     //1st layer space print
                //     for(int j = 1; j <= n-i; j++){
                //         System.out.print(" ");
                //     }
                //     //2nd layer number print
                //     for(int j = 1; j <= i; j++){
                //         System.out.print(i + " ");
                //     }
                //     System.out.println();
                // }


            // Q3. Print a palindromic number pyramid.
            
              //Ans-

                //         //Input
                // int n = sc.nextInt();

                //         // Outer Loop
                // for(int i = 1; i <= n; i++){

                //         //Inner Loop
                //     //1st layer space print
                //     for(int j = 1; j <= n-i; j++){
                //         System.out.print(" ");
                //     }
                //     //2nd layer number print (-180deg)
                //     for(int j = i; j >= 1; j--){
                //         System.out.print(j);
                //     }
                //     //3rd layer number print (0deg)
                //     for(int j = 2; j <= i; j++){
                //         System.out.print(j);
                //     }
                //     System.out.println();
                // }



        //Lecture - 6 (Advance Patterns in Java)

            // Q1. Print a Hallow Butterfly.

              //Ans- 


                //         //Input
                // int n = sc.nextInt();

                // //First Half
                //         // Outer Loop
                // for (int i = 1; i <= n; i++) {

                //         //Inner Loop
                //   //1st layer star print
                //   for (int j = 1; j <= i; j++){
                //     if(i==1 || i==j || j==1 || j==i){
                //       System.out.print("*");
                //     }else{
                //       System.out.print(" ");
                //     }
                //   }
                //   //2nd layer space print
                //   for (int j = 1; j <= 2*(n-i); j++){
                //     System.out.print(" ");
                //   }
                //   //3rd layer star print
                //   for (int j = 1; j <= i; j++){
                //     if(i==1 || i==j || j==1 || j==i){
                //       System.out.print("*");
                //     }else{
                //       System.out.print(" ");
                //     }
                //   }
                //   System.out.println();
                // }

                // //Second Half
                //         // Outer Loop
                // for (int i = n; i >= 1; i--) {
                //         //Inner Loop
                //   //1st layer star print
                //   for(int j = 1; j <= i; j++){
                //     if(i==1 || i==j || j==1 || j==i){
                //       System.out.print("*");
                //     }else{
                //       System.out.print(" ");
                //     }
                //   }
                //   //2nd layer space print
                //   for(int j = 1; j <= 2*(n-i); j++){
                //     System.out.print(" ");
                //   }
                //   //3rd layer star print
                //   for(int j = 1; j <= i; j++){
                //     if(i==1 || i==j || j==1 || j==i){
                //       System.out.print("*");
                //     }else{
                //       System.out.print(" ");
                //     }
                //   }
                //   System.out.println();
                // }


            // Q2. Print a Hallow Rhombus.

              //Ans-

                  //       //Input
                  // int n = sc.nextInt();

                  //       //Outer Loop
                  // for (int i = 1; i <= n; i++) {
                  //       //Inner Loop
                  //     //1st layer space print
                  //     for(int j = 1; j <= n-i; j++){
                  //         System.out.print(" ");
                  //     }
                  //     //2nd layer star print
                  //     for(int j = 1; j <= n; j++){
                  //         if(i==1 || i==n || j==1 || j==n){
                  //             System.out.print("*");
                  //         }else{
                  //             System.out.print(" ");
                  //         }
                  //     }
                  //     System.out.println();
                  // }


            // Q3. Print a Pascal's Triangle.

              //Ans- 

                //         //Input
                // int n = sc.nextInt();

                //         //Outer Loop
                // for (int i = 1; i <= n; i++) {
                //         //Inner Loop
                //     //1st layer space print
                //     for(int j = 1; j <= n-i; j++){
                //         System.out.print(" ");
                //     }
                //     //2nd layer number print
                //     int num = 1;
                //     for(int j = 1; j <= i; j++){
                //         System.out.print(num + " ");
                //         num = num * (i - j) / j;
                //     }
                //     System.out.println();
                // }


            // Q4. Print a number pyramid.

              //Ans-

                //         // Input
                // int n = sc.nextInt();

                //         //Outer Loop
                // for (int i = 1; i <= n; i++){

                //         //Inner Loop
                //     //1st layer space print
                //     for(int j = 1; j <= n-i; j++){
                //         System.out.print(" ");  
                //     }
                //     //2nd layer number print
                //     for(int j = 1; j <= i; j++){
                //         System.out.print(j + " ");  
                //     }
                //     System.out.println();
                // }


            // Q5. Print Inverted half pyramid with numbers.

              //Ans-

                //          //Input
                // int n = sc.nextInt();

                //          //Outer Loop
                // for(int i = 1; i <= n; i--){
                //   for(int j = 1; j <= n*j-i; j++){
                //     System.out.print(j);
                //   }
                //   System.out.println();
                // }
    }
}
