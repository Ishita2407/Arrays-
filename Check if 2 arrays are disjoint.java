// 2 arrays are said to be disjoint if they have nothing in common , their intersection gives phi
// Intution -> store elements of 1st arr in hashset , iterate on second arr and check set if it contains same value -> not disjoint , else disjoint
public class Solution{
  public static boolean isDisjoint(int arr1[], int arr2[]){
    int n = arr1.length;
    int m = arr2.length;
    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i < n; i++){
      if(!set.contains(arr1[i]) set.add(arr1[i];
    }

    for(int i = 0; i < m; i++){
      if(set.contains(arr2[i]) return false; // not disjoint
    }
    return true;  // disjoint
  }
}

// Time complexity - O(m + n)
