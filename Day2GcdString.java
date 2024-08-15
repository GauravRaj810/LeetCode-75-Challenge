/* Title: Greatest Common Divisor of Strings

You are given two strings str1 and str2. You need to determine the largest string x such that x is a divisor of both str1 and str2.

A string x is a divisor of a string y if y can be constructed by concatenating x one or more times. For example, "abc" is a divisor of "abcabc" because "abcabc" can be constructed by concatenating "abc" two times.

Your task: Write a function that returns the greatest common divisor (GCD) of str1 and str2. If there is no such string, return an empty string. */


// Solution - 
public class Day2GcdString{
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        // Creating instance of Solution 
        Solution solution = new Solution();

        String result = solution.gcdOfString(str1, str2);
        System.out.println("Gcd of String:  " + result);
        
    }
}

class Solution {
    public String gcdOfString(String str1 , String str2){
        // Case 1 - if str 2 is greater then swap - 

        if(str2.length()>str1.length()){
            return gcdOfString(str2, str1);
        }
        if(str2.equals(str1)){
            return str1;
        }
        if(str1.startsWith(str2)){
            return gcdOfString(str1.substring(str2.length()), str2);
        }
        return "";
        
    }

}