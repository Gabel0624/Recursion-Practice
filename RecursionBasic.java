import java.util.*;
/**
 * @author Grayson Abel
 * Exercise 1
 */
public class RecursionBasic {
    public static void printDown (int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n + " ");
        printDown (n-1);
    }
}


public static int factorial (int n) {
    if (n <= 0) {
        return 0;
    }
    return n * factorial(n-1);
}

public static int sumDown (int n) {
    if (n <= 0) {
        return 0;
    }
    return n + sumDown(n-1);
}

public static int arraySumUp (int [] array , int index) {
    if (index == array.length) {
        return 0;
    }
    return array [index] + arraySumUp (array ,index + 1);
}

public static String reverseStr (String str) {
    if (str == null || str.length() == 0){
        return str;
    }
    return reverseStr (str.substring (1)) + str.charAt (0);
}

public static double power (double base , int exp){
    if (exp == 0){
        return 1;
    }
    return base * power (base, exp-1);
}

public static void main (String[] args) {
    int n = 5;
    System.out.println("===================");
    System.out.printf("The factorial of %d is %d\n", n, factorial(n));
    System.out.println("===================");
    System.out.printf("The sums of n: %d and n-1 up to 1: %d\n" , n , sumDown(n));
    System.out.println("===================");
    int [] intArray = {1 , 2 , 3};
    System.out.println("The sum of array elements is: " + arraySumUp (intArray , 0));
    System.out.println("===================");
    System.out.printf("The reverse version of the given String: %s is %s" , "Grayson" , reverseStr("Grayson"));
    System.out.println("===================");
    System.out.printf("The Power of base number %.2f with exponent %d is %.2f" , 2 , 5 , power(2 , 5));
    System.out.println("===================");

}
