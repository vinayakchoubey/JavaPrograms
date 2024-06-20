import java.util.Arrays;
import java.util.Scanner;


//****************Count the number of occurrences of a particular elements x. */
// public class ArrayQues {

//     static int CountOccurrences(int[] arr, int x){
//         int count = 0;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == x){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<arr.length; i++){
//          arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter x");
//         int x = sc.nextInt();
//         System.out.print("Count of x : " + CountOccurrences(arr,x));
//     }
// }





//********************* Find the last occurrence of an element x in a given array. */

// public class ArrayQues {

//     static int LastOccurrences(int[] arr, int x){
//         int LastIndex = -1;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == x){
//                 LastIndex = i;
//             }
//         }
//         return LastIndex;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<arr.length; i++){
//          arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter x : ");
//         int x = sc.nextInt();

//         System.out.print("LastOccurrences of x : " + LastOccurrences(arr,x));
//     }
// }






//************* Count the number of elements strictly greater than value x. */

// public class ArrayQues {
//     static int strictlyGreater(int[] arr, int x){
//         int count = 0;
//         for(int i=0; i< arr.length; i++){
//             if(arr[i] > x){
//                 count++;
//             }
//         }
//         return count;
//     } 

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<arr.length; i++){
//          arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter x : ");
//         int x = sc.nextInt();
//         System.out.print("strictlyGreater of x : " +  strictlyGreater(arr,x));
//     }
// }




//************** Check if the given array is sorted or not  */

// public class ArrayQues {

//     static boolean isSorted(int[] arr){
//         boolean check = true;

//         for(int i=1; i<arr.length; i++){
//             if(arr[i] < arr[i-1]){
//                 check = false;
//                 break;
//             }
//         }
//         return check;
//     }

//      static int strictlyGreater(int[] arr, int x){
//         int count = 0;
//         for(int i=0; i< arr.length; i++){
//             if(arr[i] > x){
//                 count++;
//             }
//         }
//         return count;
//     } 

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<arr.length; i++){
//          arr[i] = sc.nextInt();
//         }

        
//         System.out.print("Is Sorted : " + isSorted(arr));
//     }
// }








//************** Sorted Array  */


// public class ArrayQues {

//      static int[] smallestAndLargestElement(int[] arr){
//         Arrays.sort(arr);
//         int[] ans = {arr[0], arr[arr.length-1]};
//         return ans;
//     }

//     static boolean isSorted(int[] arr){
//         boolean check = true;

//         for(int i=1; i<arr.length; i++){
//             if(arr[i] < arr[i-1]){
//                 check = false;
//                 break;
//             }
//         }
//         return check;
//     }

//      static int strictlyGreater(int[] arr, int x){
//         int count = 0;
//         for(int i=0; i< arr.length; i++){
//             if(arr[i] > x){
//                 count++;
//             }
//         }
//         return count;
//     } 

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<arr.length; i++){
//          arr[i] = sc.nextInt();
//         }

//         int[] ans = smallestAndLargestElement(arr);
//         System.out.println("Smallest: "+ ans[0]);
//         System.out.println("Largest: " + ans[1]);
//     }
// }






 //****************** Target sum  */

 
// public class ArrayQues {

//     static int pairSum(int[] arr, int target){
//         int n = arr.length;
//         int ans = 0;
        
//         for(int i=1; i<n; i++){
//             for(int j =0; i<n; i++){
//                 if(arr[i] + arr[j] == target){
//                     ans++;
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter target sum ");
//         int target = sc.nextInt();

//         System.out.print(pairSum(arr, target));
//     }
// }






//************ Count the number of triplets whose sum is equal to the given value x. */

// public class ArrayQues {

//     static int pairSum(int[] arr, int target){
//         int n = arr.length;
//         int ans = 0;
        
//         for(int i=0; i<n; i++){
//             for(int j =i+1; j<n; j++){
//                 for(int k=j+1;k<n; k++){
//                     if(arr[i] + arr[j] + arr[k] == target){
//                         ans++;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter target sum ");
//         int target = sc.nextInt();

//         System.out.print(pairSum(arr, target));
//     }
// }







//*************** Find the unique number in a given Array where all the elements are being repeated twice with one value being unique. */

// public class ArrayQues {

//     static int findUnique(int[] arr){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[i] == arr[j]){
//                     arr[i] = -1;
//                     arr[j] = -1;
//                 }
//             }
//         }
//         int ans = -1;
//         for(int i=0; i<n; i++){
//             if(arr[i] > 0){
//                 ans = arr[i];
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }
//         System.out.print("Unique element: " + findUnique(arr));
//     }
// }






//******************* Find the second largest elements in the given array. */

// public class ArrayQues {

//     static int findMax(int[] arr){
//         int mx = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > mx){
//                 mx = arr[i];
//             }
//         }
//         return mx;
//     }

//     static int findSecondMax(int[] arr){
//         int mx = findMax(arr);
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == mx){
//                 arr[i] = Integer.MIN_VALUE;
//             }
//         }

//         int secondMax = findMax(arr);
//         return secondMax;
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }
//         System.out.print("Second maximum element: " + findSecondMax(arr));
//     }
// }







//********** Given an array a consisting of integers. Return the first value that is repeating in this array. if no value is being repeated, return -1. */

// public class ArrayQues {

//     static int firstRepeatingNumber(int[] arr){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){
//                 if(arr[i] == arr[j]){
//                     return arr[i];
//                 }
//             }
//         }
//         return -1;
//     }
        
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }
//         System.out.print("First Repeating Number: " + firstRepeatingNumber(arr));
//     }
// }







//************* Given 2 integers a and b. swap the 2 given values using temporary variables  */


// public class ArrayQues {

//     static void swap(int a, int b){
//         System.out.println("Original values before swap");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("values after swap");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);
//     }
//     public static void main(String[] args) {
//         int a = 9;
//         int b = 3;
//         int [] arr = {1,2,3,4,5};
//         swap(a,b);
//     }
// }






//************ Givan 2 integers a and b. swap the 2 given values using sum and difference method */

// public class ArrayQues {

//     static void swapWithoutTemp(int a, int b){
//         System.out.println("Original values before swap");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);

//         a = a+b;
//         b = a-b;
//         a = a-b;

//         System.out.println("values after swap");
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);
//     }
//     public static void main(String[] args) {
//         int a = 9;
//         int b = 3;
//         int [] arr = {1,2,3,4,5};
//         swapWithoutTemp(a,b);
//     }
// }






//********* Reverse an array consisting of integer values  */

// public class ArrayQues {

//     static int[] reverseArray(int[] arr){
//         int n = arr.length;
//         int[] ans = new int[n];
//         int j=0;

//         //traversing original array in reverse direction

//         for(int i=n-1; i>=0; i--){
//             ans[j++] = arr[i];
//         }
//         return ans;
//     }

//     static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int a = 9;
//         int b = 3;
//         int [] arr = {1,2,3,4,5,6,7,8};
//         int [] ans = reverseArray(arr);
//         printArray(ans);
//     }
// }






//********* Reverse an array consisting of integer values 2nd method  */

// public class ArrayQues {

//     static void swapInArray(int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void reverseArray(int[] arr){
//         int i=0, j=arr.length-1;

//         while(i < j){
//             swapInArray(arr, i , j);
//             i++;
//             j--;
//         }
//     }
    
//     static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int a = 9;
//         int b = 3;
//         int [] arr = {1,2,3,4,5,6,7,8};
//         reverseArray(arr);
//         printArray(arr);
//     }
// }







//*********** Rotate the given array 'a' by k steps, where k is non-negative. */
//*********** NOTE:- k can be greater than n as well. */


// public class ArrayQues {

//     static int[] rotate(int[] arr, int k){
//         int n = arr.length;
//         k = k % n;
//         int[] ans = new int[n];
//         int j = 0;

//         for(int i = n-k; i<n; i++){
//             ans[j++] = arr[i];
//         }

//         for(int i=0; i<n-k; i++){
//             ans[j++] = arr[i];
//         }
//         return ans;
//     }

//     static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter array size ");
//     int n = sc.nextInt();
//     int[] arr = new int[n];


//     System.out.println("Enter " + n + "elements");
//     for(int i=0; i<n; i++){
//         arr[i] = sc.nextInt();
//     }

//     System.out.print("Enter k: ");
//     int k = sc.nextInt();

//     System.out.println("Original array");
//     printArray(arr);
//     int[] ans = rotate(arr, k);
//     System.out.println("Array after rotation");
//     printArray(ans);

//     }
// }









//******************** Rotate the given array 'a' by k steps, where k is non-negative without using extra space. */
//******************** NOTE:- k can be greater than n as well. */








//*************** Given Q queries, check if the given number is present in the array or not.  */
//*********** NOTE:- value of all the elements in the array is less than 10 to the power 5. */









//************ Two pointer method  */

//********** Sort an array consisting of only 0s and 1s */


// public class ArrayQues {
    
//     static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }


//     static void swapInArray(int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void sortZeroesAndOnes(int[] arr){
//         int n = arr.length;
//         int Zeroes = 0;

//         for(int i=0; i<n; i++){
//             if(arr[i] == 0){
//                 Zeroes++;
//             }
//         }

//         for(int i=0; i<n; i++){
//             if(i < Zeroes){
//                 arr[i] =0;
//             }else{
//                 arr[i] = 1;
//             }
//         }
//     }


        
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }
//         System.out.print("Original array: ");
//         printArray(arr);
//         sortZeroesAndOnes(arr);
//         System.out.println("Sorted array: ");
//         printArray(arr);
//     }
// }









//********** Alternate method */

// public class ArrayQues {
    
//     static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }


//     static void swapInArray(int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     static void sortZeroesAndOnes(int[] arr){
//         int n = arr.length;
//         int left = 0, right = n-1;

//         while(left < right){
//             if(arr[left] == 1 && arr[right] == 0){
//                 swapInArray(arr, left, right);
//                 left++;
//                 right--;
//             }
//         }
//     }
       

        
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }
//         System.out.print("Original array: ");
//         printArray(arr);

//         sortZeroesAndOnes(arr);

//         System.out.println("Sorted array: ");
//         printArray(arr);

//     }
// }









// public class ArrayQues {
    
//     static void printArray(int[] arr){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     static int[] makePrefixSumArray(int[] arr){
//         int n = arr.length;
//         int[] pref = new int[n];
//         pref[0] = arr[0];

//         for(int i=0; i<n; i++){
//             pref[i] = pref[i-1] + arr[i];
//         }
//         return pref;
//     }



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of an array : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.print("Enter " + n + " array Elements : ");
//         for(int i=0; i<n; i++){
//          arr[i] = sc.nextInt();
//         }
//         System.out.print("Input Array: ");
//         printArray(arr);
//         int[] pref = makePrefixSumArray(arr);
//         printArray(pref);
//     }
// }








//*********** key is present or not  */

// public class ArrayQues{

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array: ");
//         int x = sc.nextInt();
//         int[] arr = new int[x];

//         System.out.println("Enter " + x + " elements");
//         for(int i=0; i<arr.length; i++){
//             arr[i] = sc.nextInt();
//            }
        
//         System.out.print("Enter key : ");
//         int key = sc.nextInt();
//         int count = 0;
//         int pos = 0;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == key){
//                 count++;
//                 pos = i+1;
//                 System.out.print("Key " + key + " is present");
//                 break;
//             }
            
//         }
//         if(count==0){
//         System.out.println("Key Not Found");
//         }
//     }
// }







public class ArrayQues{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = {"Monday" , "Joy" , "Vinayak"};
        for
    }
}