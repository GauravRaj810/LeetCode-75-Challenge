public class ReverseWords {
    public static void main(String[] args) {
        String letter = "My name is Khan";
        // Call static method using class name
        String ans = Solution.reverseWords(letter); 
        System.out.println(ans); // Output the result
    }
}

class Solution {
    static String reverseWords(String s) {
        // Split by one or more spaces
        String[] words = s.split("\\s+");
        
        // StringBuilder to store the reversed sentence efficiently
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" "); // Append space between words
            }
        }
        return sb.toString();
    }
}
