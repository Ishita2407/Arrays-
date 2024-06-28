class Solution {
    public int findDuplicate(int[] nums) {
        // Brute force 
        // TC : O(N) SC: O(N)
        // use Set data structure to find the duplicate element
        // HashSet<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     if(set.contains(num)){
        //         return num;
        //     }
        //     // otherwise add it to the set
        //     set.add(num);
        // }
        // return -1;

        // Better approach
        // Floyd's Cycle detection Algo
        //  TC : O(N) Sc: O(1)

        int slow = 0, fast=0;
            
        int found = 0;
            
        while( true ){
            slow = nums[slow];
            fast = nums[ nums[fast] ];
            
            if( slow == fast ){
                break;
            }
        }
        // Locate the start node of cycle (i.e., the duplicate number)
        while( true ){
            slow = nums[slow];
            found = nums[found];
            
            if( slow == found){
                break;
            }
        }
        return found;
    }
}
