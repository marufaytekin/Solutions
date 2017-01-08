import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by maruf on 9/29/16.
 */

public class Palindrome {

    public static void main(String[] args) {

        String s = "I am not palindrome";
        String s2 = "WasitacaroracatIsaw".toLowerCase();
        String s3 = "WsaitacaroractaIsaw".toLowerCase();
        String s4 = "WaitacaroractaIsaw".toLowerCase();

        System.out.println(isPalindrome(s.toLowerCase()));
        System.out.println(isPalindrome(s2.toLowerCase()));
        System.out.println(rPalindrome(s.toLowerCase()));
        System.out.println(rPalindrome(s2.toLowerCase()));

        System.out.println(palindromePerm(s2));
        System.out.println(palindromePerm(s3));
        System.out.println(palindromePerm(s4));
    }

    /**
     * palindrome with loop.
     * Complexity: O(n)
     * Space: O(n)
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        char [] cArr = s.toCharArray();
        int size = cArr.length;
        for (int i = 0; i < size/2; i++){
            if (cArr[i] != cArr[size - i -1])
                return false;
        }
        return true;
    }

    /**
     * recursive palindrome.
     * Complexity: O(n)
     * Space: O(1)
     * @param s
     * @return
     */
    public static boolean rPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        else return rPalindrome(s.substring(1, s.length() - 1));
    }

    /**
     * palindrome by counting characters.
     * Complexity: O(n)
     * space: O(n)
     * @param s
     * @return
     */
    public static boolean palindromePerm (String s) {
        char [] cArr = s.toCharArray();
        HashMap<Character, Integer> table = new HashMap<Character, Integer>();
        for (Character c : cArr) {
            if (table.containsKey(c))
                table.put(c,table.get(c)+1);
            else
                table.put(c, 1);
        }

        return checkMaxOneEdit(table);
    }

    private static boolean checkMaxOneEdit(HashMap<Character, Integer> table) {
        boolean status = false;
        for (Map.Entry<Character, Integer> entry : table.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (status) return false;
                status = true;
            }
        }
        return true;
    }

}
