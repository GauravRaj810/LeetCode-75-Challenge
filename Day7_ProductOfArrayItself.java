public class Day7_ProductOfArrayItself{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {1,2,3,4};
        int result[] = solution.productExceptSelf(nums);

        // print the result 

        System.out.println("Product of the Array itself:");
        for(int res: result){
            System.out.print(res + " ");
        }
    }
}


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProductFromStart = new int[n];
        int[] suffixProductFromEnd = new int[n];
        int[] result = new int[n];

        // Calculate prefix products from the start
        prefixProductFromStart[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixProductFromStart[i] = prefixProductFromStart[i - 1] * nums[i - 1];
        }

        // Calculate suffix products from the end
        suffixProductFromEnd[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffixProductFromEnd[i] = suffixProductFromEnd[i + 1] * nums[i + 1];
        }

        // Calculate the result array
        for (int i = 0; i < n; i++) {
            result[i] = prefixProductFromStart[i] * suffixProductFromEnd[i];
        }

        return result;
    }
}
