//**** Printing Hello world 5 times 
// public class Loops {
//     public static void main(String[] args) {
//         int counter = 0;
//         while(counter<5){
//             System.out.println("Hello Vinayak");
//             counter++;
//         }
//     }
// }



//***** Printing numbers from 1 to 10 
// public class Loops{
//     public static void main(String[] args) {
//         int number = 1;
//         while(number <= 10){
//             System.out.println(number);
//             number++;
//         }
//     }
// }


//****Write a program to print counting as given by user using while loop */
// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:-");
//         int input = sc.nextInt();
//         int number = 1;
//         while(number <= input){
//             System.out.println(number);
//             number++;
//         }
//     }
// }


//****Print sum of first n natural numbers */
// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:-");
//         int n = sc.nextInt();
//         int i = 1;
//         int sum = 0;
//         while(i <= n){
//             sum += i; 
//             i++;
//         }
//         System.out.println("Sum = " + sum);
//     }
// }



//****Write a program to print counting as given by user using for loop */
// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:-");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             System.out.println(i);
//         }
        
//     }
// }


//*** write a program to print square pattern */
// public class Loops {

//     public static void main(String[] args) {
//         for(int line = 1; line<=4; line++){
//             System.out.println("****");
//         }
//     }
// }



//**** Print reverse of any number */
// public class Loops{
//     public static void main(String[] args) {
//         int n = 10889;
//         while(n > 0){
//             int LastDigit = n%10;
//             System.out.print(LastDigit);
//             n = n / 10;
//         }
//     }
// }



// Count the number of digits for a given number n  
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number : ");
//         int n = sc.nextInt();
//         int numofdigit = 0;
//         int original_n = n;
//         while(n>0){
//             n = n / 10;
//             numofdigit ++;
//         }
//         System.out.println("number of digits in  " + original_n +  "="  + numofdigit);
//     }
// }




//** Find the sum of digits in a given number n   */
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number : ");
//         int n = sc.nextInt();
//         int sumofdigit = 0;
//         int original_n = n;
//         while(n>0){
//             sumofdigit += n % 10;
//             n = n / 10;
//             // sumofdigit ++;
//         }
//         System.out.println("number of digits in  " + original_n +  "="  + sumofdigit);
//     }
// }


//*** Reverse the digits of a given number  */
// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = 0;
//         while(n>0){
//             ans = ans * 10 + n % 10;
//             n /= 10;
//         }
//         System.out.println(ans);
//     }
// }



//** Find the sum of the following series  */
//*  S = 1 -2 +3 -4......n */

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans = 0;
//         for(int i=0; i<=n; i++){
//             if(i % 2 == 0){
//                 ans -= i; 
//             }
//             else{
//                 ans += i;
//             }
//         }
//         System.out.println(ans);
//     }
// }



//** Print the first n factorial number  */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int factorial = 1;
//         for(int i=1; i<=n; i++){
//             factorial = factorial*i;
//             System.out.println("Factorial of " +  i + " = "+ factorial );
//         }
//     }
// }



//*** Given two number a and b. find a raise to the power b. */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int ans = 1;
//         for(int i=1; i<=b; i++){
//             ans = ans*a;
//             // System.out.println( ans );
//         }
//          System.out.println( ans );
//     }
// }



//**** Nested Loop Questions  */

// public class Loops{
//     public static void main(String[] args) {
//         for(int i=1; i<=3; i++){
//             for(int j=1; j<=6; j++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }


//** Print pattern using the given input of Row and Column  */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the value of Column : ");
//         int c = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=c; j++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }



//***** //** Print Rectangular pattern using the given input of Row and Column  */ */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the value of Column : ");
//         int c = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=c; j++){
//                 if(i == 1 || i == r || j == 1 || j == c)
//                     System.out.print("*");
//                     else
//                     System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }


//************ TRIANGULAR PATTERN ***********

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number  : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }



//**** //********** Inverted triangle ********** */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number  : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }


//*** Pyramid Triangle  */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int r = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=r-i; j++){
//                System.out.print(" ");
//             }
//             for(int k=1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//****** Numerical Rectangular Pattern  */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number  : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=i; j<=n; j++){
//                 System.out.print(j);
//                 }
//                 for(int k=1; k<= i-1; k++){
//                     System.out.print(k);
//                 }
//                 System.out.println();
//             }
//         }
//     }



//**** Rectangular Pattern with Numbers */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the value of Column : ");
//         int c = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=c; j++){
//                 System.out.print(j);
//                 }
//                 System.out.println();
//             }
//         }
//     }



//***** Rectangular Numeric Pattern on the basis of Even and Odd concept  */

// import java.util.*;
// public class Loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of Row : ");
//         int r = sc.nextInt();
//         System.out.print("Enter the value of Column : ");
//         int c = sc.nextInt();
//         for(int i=1; i<=r; i++){
//             for(int j=1; j<=c; j++){
//                 if((i+j) %2 == 0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(2);
//                 }
//                 }
//                 System.out.println();
//             }
//         }
//     }
















