// Brute force approach

public static int Inversion(int arr[], int n){
  int cnt = 0;

  for(int i = 0; i < n; i++){
    for(int j = i + 1; j < n; j++){
      if(arr[i] > arr[j]){
        cnt++;
      }
    }
    return cnt;
  }
}


// Optimal solution
Time Complexity: O(N*logN), where N = size of the given array.
Reason: We are not changing the merge sort algorithm except by adding a variable to it. So, the time complexity is as same as the merge sort.

Space Complexity: O(N), as in the merge sort We use a temporary array to store elements in sorted order.
// Using merge sort 
private static merge(int arr[], int low, int mid, int high){
  ArrayList<Integer> temp = new ArrayList<>(); // temporary array 
  int left = low;
  int right = mid + 1;

  while(left <= mid && right <= high){
    // compare the left and right element 
    if(arr[left] <= arr[right){
      temp.add(arr[left]);
      left++;
    }else{
      // right half is greater 
      temp.add(arr[right];
      cnt += (mid - left + 1);
      right++;
  }

  // if elements are remaining in the left half
  while(left <= mid){
    temp.add(arr[left]);
    left++;
  }

  // if elements are remaining in the right half
  while(right <= high){
    temp.add(arr[right]);
    right++;
  }

  // Transferring all the elements from temporary to arr
    for(int i = low; i <= high; i++){
      arr[i] = temp.get(i - low);
    }
    return cnt;
}
public static int mergeSort(){
  int cnt= 0;
  if(low >= high){
    return cnt;
  }

  int mid = (low + high)/2;

  cnt += mergeSort(arr, low, mid);
  cnt += mergeSort(arr, mid + 1, high);
  cnt += merge(arr, low, mid, high);
  return cnt;
}
 public static int numberOfInversions(int[] a, int n) {
       // Count the number of pairs:
      return mergeSort(a, 0, n - 1);
 }
