class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 0;
        int count = 0;

        if(n == 0) return 0;
        Set<Integer> set = new HashSet<>();
        // Add array elements in the set 
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        // iterate over the set and find the starting num of sequence
        for(int it: set){
            if(!set.contains(it - 1)){
                // starting num found
                count = 1;
                int x = it;

                // keep finding consecutive elements
                while(set.contains(x+1)){
                    x += 1;
                    count += 1;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
