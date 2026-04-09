import java.util.*;
/**
 * @author Grayson Abel
 * Exercise 2
 */
public class Permutations {
    public static ArrayList<String> permutations(String str) {
        ArrayList <String> result = new ArrayList<>();
        if (str == null){
            return result;
        }
        if (str.length() <= 1){
            result.add(str);
            return result;
        }
        for (int i = 1; i < str.length(); i++) {
            char chosen = str.charAt(i);
            String part = str.substring(0, i) + str.substring (i + 1);
            ArrayList <String> permutes = permutations(part);
            for (String s : permutes) {
                result.add(chosen + s);
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}

