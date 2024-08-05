public class Solution{
  // Using hashmap
  public int firstUniqueNum(int arr[]){
    int n = arr.length;

    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      if(map.containsKey(arr[i]){
        int occurence = map.get(arr[i]) + 1;
        map.put(arr[i], occurrence);
      }else{
        map.put(arr[i], 0);
      }
    }

    for(int i = 0; i < n; i++){
      if(map.get(arr[i] == 0){
        return arr[i];
      }
      return -1;
    }
  }
}

// Tree map can also be used
// Time complexity - O(n) in both the cases - hashmap and treemap usage
