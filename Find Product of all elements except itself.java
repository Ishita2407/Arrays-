public class Solution{
  public static int Product(int arr[]){
    int n = arr.length;
    int left[] = new int[n + 1];
    int right[] = new int[n + 1];
    int result[] = new int[n + 1];

    left[0] = 1;
    for(int i = 1; i < n; i++){
      left[i] = left[i - 1] * arr[i - 1];
    }

    right[n - 1] = 1;
    for(int i = n - 2; i >= 0; i--){
      right[i] = right[i + 1] * arr[i + 1];
    }

    for(int i = 0; i < n; i++){
      result[i] = left[i] * right[i];
    }
    return result;
  }
}
