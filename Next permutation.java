class Solution {
    public void nextPermutation(int[] nums) {
        // Time complexity - O(3N) ~ O(N)
        // Space complexity - O(1) Modifications r done in the arr

        int n = nums.length;
        int idx = -1;
        for(int i = n - 2; i >= 0; i--){
            // breakpoint found
            // arr is sorted upto idx i 
            if(nums[i] < nums[i + 1]){
                idx = i;
                break;
            }
        }

        // if there is no breaking point
        // array is sorted in descending order
        // next permutation will be the 1st permutation
        if(idx == -1){
            reverse(nums, 0);
        }

        // left half of breakpoint should remain same
        // find an element slightly greater than the idx element and swap
        else{
            for(int i = n - 1; i > idx; i--){
            if(nums[i] > nums[idx]){  
                swap(nums,i, idx);
                break;
            }
        }

        // swap right half completely , to maintain lexicographic order
        reverse(nums, idx + 1);
        }
        
    }
    public void swap(int nums[],int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int nums[], int start){
        int n = nums.length;
        int i = start;
        int j = n-1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}


SOlution 2
class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;
        // step 1 find breaking point 
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point 
        if(ind1==-1){
            reverse(nums,0);
        }
        
        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
