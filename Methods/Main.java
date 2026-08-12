/**
 * -----> FIRST EXAMPLE  <--------
 * Method without Return Type and Without Argumnets
 * In these Type of methods return Type wull be void and method will not have arguments
 */
// class Main{

//     public static void main(String[]args){
//         System.out.println("Hello");
// run();
//     }

//     public static void run(){
//         System.out.println("This is method without return and without Argument");

//     }
// }
//-------------------------------------------------------------------------------------------------------------------------------

/**
 * -------> SECOND TYPE <-----
 * METHOD without return type and with arguments
 * 
 */

// public class Main {

// public static void main(String[] args) {
//     printSum(12, 13);
// }
// public static void printSum(int a , int b){
//     int sum = a+b;
//     System.out.println(sum);
// }
//     }

//--------------------------------------------------------------------------------------------------

/**
 * ----> THID TYPE <----
 * Method with return type and without aruments.
 * void will be replaced with the datatype of the value that we want to return
 */

// class Main {
//     public static void main(String[] args) {
//         /**
//          * step 01 ---> we can directly print the returned value
//          */
//         // System.out.println(getPi());

//         /**
//          * step 02 --->
//          * we can store the returned value into a variable
//          */
//         // int a = getPi();
//         // System.out.println(a);

//         /**
//          * step 03 --->
//          * we can use return value in switch case
//          */

//         // switch (getPi()) {
//         // case 1 -> System.out.println("hello");
//         // case 2 -> System.out.println("Hello");
//         // case 3 -> System.out.println("How are you");
//         // case 4 -> System.out.println("This is printing");
//         // default -> System.out.println("This is default value");
//         // }

//         /**
//          * step 4 -->
//          * we can pass the returned value as argument for another method also
//          */
//         // printInt(getPi());

//         /**
//          * \
//          * setp 5 --->
//          * We can directly use returned value in condi
//          */
//         // if (getPi() == 4) {
//         //     System.out.println("Value of getPi() method is equal");
//         // } else {
//         //     System.out.println(" Value is not same");
//         // }
//     }

//     public static void printInt(int a) {
//         System.out.println("The value of another method getPi() is pasees int printint MEthod as an Argument  -> " + a);
//     }

//     public static int getPi() {
//         return 4;
//     }
// }

//-----------------------------------------------------------------------------------------------

// public class Main {

//     public static void main(String[] args) {
//         System.out.println(getPi());
//     }
//     public static int getPi(){
//         int i = 1;
//         if(i>2){
//          return 4;
//         }
//         System.out.println("hello");
//         return 0;
//     }
// }

/**
 * METHOD 4
 *  Method with return and with arguments
 */
/**
 * Main
 */
// public class Main {

//     public static void main(String[] args) {
//         int addition = sum(12, 120);
//         System.out.println(addition);
//         System.out.println(sum(12, 120));
//     }

//     public static int sum(int a, int b) {
//         return a + b;
//     }
// }