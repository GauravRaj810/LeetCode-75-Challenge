

/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string. */


/* Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r */


public class Day1MergedString {
    public static void main(String[] args) {
        // create instance of the Solution class
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        String result = solution.mergedAlternatively(word1 , word2);  // we can not directly use the merge method we use refernce of the class so thats why we above create solution object with the new keyword 
        System.out.println("The merged String are :" + result);
    }
}

// The class name should be captial of 1st letter 
class Solution{
    public String mergedAlternatively(String word1 , String word2){
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        while(i<n1 || i < n2){
            if(i<n1){
                sb.append(word1.charAt(i));
            }
            if(i<n2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
