// Brute force approach

import java.util.*;
public class Solution {
static int solve(int[] a){
	int  max = 0;
	for(int i = 0; i < a.length; ++i){
		int sum = 0;
		for(int j = i; j < a.length; ++j){
			sum += a[j];
			if(sum == 0){
				max = Math.max(max, j-i+1);
			}
		}
	}
	return max;
   }

    public static void main(String args[]) 
    { 
        int a[] = {9, -3, 3, -1, 6, -5};
        System.out.println(solve(a));
    } 
}


Optimal soltuion
class GfG
{
    int maxLen(int arr[], int n)
    {
        int maxi = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            sum += arr[i];
            
            if(sum == 0){
                maxi = i + 1;
            }else{
                if(map.get(sum) != null){
                    maxi = Math.max(maxi, i - map.get(sum));
                }else{
                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }
}

Complexity Analysis
Time Complexity: O(N), as we are traversing the array only once

Space Complexity: O(N), in the worst case we would insert all array elements prefix sum into our hashmap
