public class Solution{
  public static void rotateArr(int arr[]){
    int n = arr.length;
    
    int lastElem  = arr[arr.length - 1];
    for(int i = n - 1; i > 0; i++){
      arr[i] = arr[i - 1];
    }
    arr[0] = lastElem;
  }
}
