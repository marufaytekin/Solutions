import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by maruf on 1/8/17.
 */
public class Anagram {

    public static void main(String[] args) {

        System.out.print(isAnagram("abcd", "bcda"));
    }

    public static boolean isAnagram(String s1, String s2) {

        char [] arr1 = s1.toCharArray();
        char [] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }

}
