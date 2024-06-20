//*** Check whether the number is prime number or not */

// public class Functions {
//     public static boolean isPrime(int n) {
//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++) {
//             if(n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
// public static void main(String[] args) {
//     System.out.println(isPrime(12)); 
// }
 
// }




//*** Check whether the number is prime number or not BY using Optimised Method */

// import java.util.*;
// public class Functions {
//     public static boolean isPrime(int n) {
//         if(n == 2) {
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// public static void main(String[] args) {
//     System.out.println(isPrime(7)); 
// }
// }


//**** Print sum of two numbers  */

public class Functions {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,5));
    }
}


