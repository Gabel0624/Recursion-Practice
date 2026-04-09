/**
 * @author Grayson Abel
 */
public class RecursionTest {
    public static String reverse (String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static int sumUpN (int n){
        if (n==1){
            return 1;
        }
        return n + sumUpN (n-1);
    }

    public static int printDown (int n){
        if (n==1){
            return 1;
        }
        System.out.printf("%d " , n);
         return printDown(n-1);
    }

    // Main
    public static void main(String[] args) {
        System.out.println(printDown(100));

    }
}
