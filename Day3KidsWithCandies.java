import java.util.ArrayList;
import java.util.List;  // Import only necessary packages

public class Day3KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        Solution solution = new Solution();
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i : candies) {
            if (i + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
