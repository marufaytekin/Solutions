
/**
 * Created by maruf on 1/8/17.
 *
 * The maximum subarray problem
 *
 * The maximum subarray problem is the task of finding the contiguous subarray
 * within a one-dimensional array of numbers which has the largest sum.
 * For example, for the sequence of values -2, 1, -3, 4, -1, 2, 1, -5, 4;
 * the contiguous subarray with the largest sum is 4, -1, 2, 1, with sum 6.
 *
 */
public class MaxSubarrayProblem {

    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxConseqetiveSubarraySum(arr);
    }

    // Kadane's algorithm. O(n) complexity
    public static void maxConseqetiveSubarraySum(int [] arr) {
        int currSum = 0;
        int maxSum = 0;
        int n = arr.length;
        int min = 0;
        int max = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] + currSum <= 0){
                currSum = 0;
                min = i+1;
                max = i+1;
            } else {
                currSum += arr[i];
            }
            if (currSum > maxSum) {
                maxSum = currSum;
                max = i;
            }
        }
        System.out.print("Max Sub Array: ");
        for (int j=min; j<=max;j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("Sum: " + maxSum);
    }


}
