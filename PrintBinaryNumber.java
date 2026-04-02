/**
 * @author Grayson Abel
 */
public class PrintBinaryNumber {
    public static void printBinaryNumber (String str , int length){
    if (length == 0){
        System.out.println(str);
        return;
    }
    printBinaryNumber(str + "0" , length -1);
    printBinaryNumber(str + "1" , length -1);
    }
    public static void main(String[] args) {
        printBinaryNumber("" , 2);
    }
}
