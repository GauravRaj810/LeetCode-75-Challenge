public class Day8_IncreasingTripletSequence {
    public static void main(String[]args){
        int nums[] = {2,1,5,0,4,6};

        // call the method to check for increasing triplet subsequence -- 
        boolean result = incresingTriplet(nums);


        // print the result 
        if(result){
            System.out.println("There exists and incresing triplet subsequence");
        } else {
            System.out.println("NO incresing triplet subsequnce found");
        }
    }


    // method to check for incresing triplet subsequnce 
    public static boolean incresingTriplet(int[]nums){
        // Edge case: if the array lentght is less than 3 , there cant be a triplet 
        if(nums.length<3){
            return false;
        }

        // intialize two variable to store the smallest and second smallest values 
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        // Traverse the array - 
        for(int num : nums){
            // if the current number is smaller than or equal to 'first', 
            // if we update 'first' to the current number 
            if(num<=first){
                first = num;
            }else if(num<=second){
                second = num;
            }
            // if we find a no than both 'first' and second , we have found a triplet ...  
            else {
                return true;
            }
        }
        // if no triplet is found , return false 
        return false;
    }
}
