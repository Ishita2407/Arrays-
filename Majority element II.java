class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int majority1 = 0, majority2 = 0;

        // First pass

        for(int i=0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != majority2){
                count1 = 1;
                majority1 = nums[i];
            }else if(count2 == 0 && nums[i] != majority1){
                count2 = 1;
                majority2 = nums[i];
            } else if(majority1 == nums[i]){
                count1++;
            } else if(majority2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        int threshold = nums.length/3;

        // Second pass
        count1 = 0;
        count2 = 0;

        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(majority1 == nums[i]) count1++;
            else if(majority2 == nums[i]) count2++;
        }

        if(count1 > threshold){
            result.add(majority1);
        } 
        if(count2 > threshold){
            result.add(majority2);
        }
        return result;
    }
}
