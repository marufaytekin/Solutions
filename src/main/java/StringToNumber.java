/**
 * Created by maruf on 1/8/17.
 */
public class StringToNumber {

    public static int convertStrToNum(String str) {
        if (str == null) throw new IllegalArgumentException("input must be a string...");
        char [] s = str.toCharArray();
        int n = s.length;
        int val = 0;
        boolean sign = true;
        for (int i = 0; i < n; i++) {
            if (s[i] == '-') {
                sign = false;
            }
            else {
                //val += (s[i]-'0') * Math.pow(10, n-i-1);
                String num = Character.toString(s[i]);
                val = val * 10;
                val += Integer.parseInt(num);
            }
        }
        if (!sign) val = -val;
        return val;
    }

}
