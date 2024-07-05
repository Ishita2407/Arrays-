// Brute force approach
import java.util.*;
public class Solution{
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int cnt = 0;

        // Step 1: Generating subarrays:
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                //step 2:calculate XOR of all
                // elements:
                int xorr = 0;
                for (int K = i; K <= j; K++) {
                    xorr = xorr ^ a[K];
                }

                // step 3:check XOR and count:
                if (xorr == k) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}

Better solution
import java.util.*;
public class Solution {
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int cnt = 0;
        // Step 1: Generating subarrays:
        for (int i = 0; i < n; i++) {
            int xorr = 0;
            for (int j = i; j < n; j++) {

                //step 2:calculate XOR of all
                // elements:
                xorr = xorr ^ a[j];

                // step 3:check XOR and count:
                if (xorr == k) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}  

// Optimal solution
public static int CountSubarr(ArrayList<Integer> A, int B){
  int xr = 0;
  int cnt = 0;
  int n = A.size();
  HashMap<Integer, Integer> map = new HashMap<>();

  map.put(xr, 1);

  for(int i = 0; i < n; i++){
    xr = xr ^ A.get(i);

    int x = xr ^ B;  // formula

    if(map.containskey(x)){
       cnt += map.get(x);
    }

    if(map.containsKey(xr)){
      map.put(xr, map.get(xr) + 1);
    }else{
      map.put(xr, 1);
    }
  }
  return cnt;
}
