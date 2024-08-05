public class Solution{
  public static int[] removeElem(int arr[]){
    int n = arr.length;

    int cnt = 0;
    for(int i = 0; i < n; i++){
      if(arr[i] % 2 != 0){
        cnt++;
      }
    }
    int result[] = new int[cnt];
    int idx = 0;

    for(int i = 0; i < n; i++){
      if(arr[i] % 2 != 0){
        result[idx++] = arr[i];
      }
    }
    return result;
  }
}
