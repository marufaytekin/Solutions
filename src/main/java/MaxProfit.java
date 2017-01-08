import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by maruf on 11/9/16.
 */
public class MaxProfit {

    public static void main(String[] args) {

        int [] b = {6, 7, 8, 10, 2, 12, 19, 5, 3};
        maxProfit(b);

    }

    //Given array of stock prices. Buy sell decision max profit
    public static void maxProfit(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Input must be an array");
        int a = 0;
        int b = 0;
        int max = 0;
        int n = arr.length;
        for (int i = 0; i < n; i ++){
            for (int j = i; j < n; j++) {
                int curr = arr[j] - arr[i];
                if (curr > max) {
                    a = i;
                    b = j;
                    max = curr;
                }
            }
        }

        System.out.println("Buy : " + arr[a] + ", Sell " + arr[b] + " max profit will be " + max);

    }


}
