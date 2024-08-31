public class CanPlaceFlower {
    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        Solution solution = new Solution(); // Create an instance of Solution
        boolean result = solution.canPlaceFlowers(flowerbed, n); // Call the method
        System.out.println(result); // Print the result
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current position is empty and both adjacent spots are empty or out of bounds
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                // Place a flower and skip the next position
                flowerbed[i] = 1;
                count++;
                i++; // Move to the next position after placing a flower
            }
        }

        return count >= n;
    }
}
