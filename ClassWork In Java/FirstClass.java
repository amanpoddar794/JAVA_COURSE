import java.util.*;

public class FirstClass {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                //Lecture - 1  to  Lecture - 6
                
                // int n = sc.nextInt();

                // if(n%2==0){
                //     System.out.println("You entered an even number");
                //     for(int i=2; i<= n; i+=2){
                //         System.out.println(i);
                //     }
                // }else{
                //     System.out.println("You entered Odd number");
                //     for(int i=2; i<= n; i+=2){
                //         System.out.println(i-1);
                //     }
                // }

                // for (int i = 0; i < 10; i++) {
                //     System.out.println("Apna College");
                // }

                // int a = sc.nextInt();

                // int button = sc.nextInt();
                // switch(button){

                //     case 1 : 
                //         if(100>=90){
                //             System.out.println("This is Good");
                //         }
                //         else if(89>=60){
                //             System.out.println("This is also Good");
                //         }
                //         else{
                //             System.out.println("This is Good as well");
                //         }
                //     break;
                //     case 0 : System.out.println("Not Available");
                //     break;
                // }

                // int n = sc.nextInt();

                // if(n%n==1){
                //     for (int i = 0; i<= n; i++) {
                //         System.out.println("Prime Number");
                //     }
                // }

                // Input
                // int n = sc.nextInt();
                // int m = sc.nextInt();


                                //   Solid Rectangle


                // // Outer Loop

                // for (int i = 1; i <= n; i++) {

                //     // Inner Loop

                //     for (int j = 1; j <= m; j++) {
                //         System.out.print("*" + " ");
                //     }
                //     System.out.println();
                // }


                                //   Hollow Rectangle


                // // Input
                // int n = sc.nextInt();

                // // Outer Loop
                // for (int i = 1; i <= n; i++) {

                // //  Inner Loop 
                //     for (int j = 1; j <= n; j++) {
                //         if(i == 1 || i == n || j == 1 || j == n){
                //             System.out.print("*" + " ");
                //         }else{
                //             System.out.print(" " + " ");
                //         }
                //     }
                //     System.out.println();
                // }


                                //  Half Pyramid


                // //   Input      
                
                // int n = sc.nextInt();

                // // Outer Loop   
                // for (int i = 1; i <= n; i++) {

                //     // Inner Loop
                //     for(int j = 1; j <= i; j++) {
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }

                        
                                //  Inverted Half Pyramid

                
                //  // Input

                // int n = sc.nextInt();

                //     // Outer Loop
                // for(int i = n; i >= 1; i--){

                //     // Inner Loop
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }



                                //  Half Pyramid (rotated by 180 deg)  
                
                
                //     // Input
                // int n = sc.nextInt();

                //     // Outer Loop
                // for (int i = 1; i <= n; i++) {

                //     // Inner Loop -> Space print
                //     for (int j = 1; j <= n - i; j++) {
                //         System.out.print(" ");
                //     }
                //     // Inner Loop -> Star print
                //     for(int k = 1; k <= i; k++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }


                                //  Inverted Half Pyramid (rotated by 180deg)


                //     // Input
                // int n = sc.nextInt();

                //     // Outer Loop
                // for(int i = n; i >= 1; i--){

                //     // Innner Loop -> Star print
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("*");
                //     }
                //     // Inner Loop -> Space print
                //     for(int j = 1; j <= n-i; j++){
                //         System.out.print(" ");
                //     }
                //     System.out.println();
                // }


                                //  Half Pyramid (Number Pattern)


                //     // Input
                // int n = sc.nextInt();

                // // Outer Loop
                // for (int i = 1; i <= n; i++) {

                //     // Inner Loop
                //     for(int j = 1; j <= i; j++){
                //         System.out.print(j);
                //     }
                //     System.out.println();
                // }



                                //  Inverted Half Pyramid (Number Pattern)
        

                //     // Input

                // int n = sc.nextInt();

                // // Outer Loop
                // for (int i = n; i >= 1; i--) {

                //     // Inner Loop
                //     for (int j = 1; j <= i; j++) {
                //         System.out.print(j);
                //     }
                //     System.out.println();           
                // }


                                //  Floyd's Triangle (Number Pattern)


                //         // Input
                
                // int n = sc.nextInt();
                // int number = 1;

                // // Outer Loop
                // for(int i = 1; i <= n; i++) {

                //     // Inner Loop 
                //     for(int j = 1; j <= i; j++) {
                //         System.out.print(number + " ");
                //         number++; //number++ = number + 1
                //     }
                //     System.out.println(); 
                // }



                                //     0-1 Pattern
                
                // // Input 

                // int n = sc.nextInt();
                
                // // Outer Loop
                // for(int i = 1; i <= n; i++){

                //         // Inner Loop 
                //         for(int j = 1; j <= i; j++){
                //                 int sum = i + j;
                //                 if(sum % 2 == 0){ //even
                //                         System.out.print("1 ");
                //                 } else{ //odd
                //                         System.out.print("0 ");
                //                 }
                //         }
                //         System.out.println();
                // }



                                //     Advance Pattern



                                //     Butterfly Pattern

                // //Input
                // int n = sc.nextInt();

                // //upper half
                // for (int i = 1; i <= n; i++) {
                //     //1st part star
                //     for(int j = 1; j<= i; j++){
                //         System.out.print("*");
                //     }
                //     //space print
                //     for(int j = 1; j <= 2 * (n-i); j++){
                //         System.out.print(" ");
                //     }
                //     //2nd part star
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }

                // //Lower half
                // for (int i = n; i >= 1; i--) {
                //     //1st part star
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("*");
                //     }
                //     //space print
                //     for(int j = 1; j <= 2 * (n-i); j++){
                //         System.out.print(" ");
                //     }
                //     //2nd part star
                //     for(int j = 1; j <= i; j++){
                //         System.out.print("*");
                //     }
                //     System.out.println();
                // }



                                //Solid Rombus

                // //Input
                // int n = sc.nextInt();

                // for(int i = 1; i <= n; i++){
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



                                //Number Pyramid
                            
                // //Input
                // int n = sc.nextInt();

                // for (int i =  1; i <= n; i++) {
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



                                //Palindromic Pattern

                // //Input
                // int n = sc.nextInt();

                // for(int i = 1; i <= n; i++){
                //         //1st layer space print
                //         for(int j = 1; j <= n-i; j++){
                //                 System.out.print(" ");
                //         }
                //         //2nd layer number print (-180deg)
                //         for(int j = i; j >= 1; j--){
                //                 System.out.print(j);
                //         }
                //         //3rd layer number print (0deg)
                //         for(int j = 2; j <= i; j++){
                //                 System.out.print(j);
                //         }
                //         System.out.println();
                // }




                                //Diamond Pattern

                // //Input
                // int n = sc.nextInt();
   
                // //Upper half
                // for (int i = 1; i <= n; i++) {
                //         //1st layer space print
                //         for(int j = 1; j <= n-i; j++){
                //                 System.out.print(" ");
                //         }
                //         //2nd layer star print
                //         for(int j = 1; j <= i; j++){
                //                 System.out.print("*");
                //         }
                //         //3rd layer star print
                //         for(int j = 2; j <= i; j++){
                //                 System.out.print("*");
                //         }
                //         System.out.println();
                // }   
                // //Lower half
                // for (int i = n; i >= 1; i--) {
                //         //1st layer space print
                //         for(int j = 1; j <= n-i; j++){
                //                 System.out.print(" ");
                //         }
                //         //2nd layer star print
                //         for(int j = 1; j <= i; j++){
                //                 System.out.print("*");
                //         }
                //         //3rd layer star print
                //         for(int j = 2; j <= i; j++){
                //                 System.out.print("*");
                //         }
                //         System.out.println();
                // }


                

                                // Aage ka Second Class.java me hai
        }
}


