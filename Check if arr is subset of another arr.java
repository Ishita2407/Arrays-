public class Solution{
  public boolean isSubset(int arr1[], int arr2[]){
    int n = arr1.length;
    int m = arr2.length;
    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i < n; i++){
      if(!set.contains(arr1[i]){
        set.add(arr1[i]);
      }
    }

    for(int i = 0; i < m; i++){
      if(set.contains(arr2[i]){
        return true;
      }
    }
    return false;
  }
}

// Time complexity - O(m + n)
