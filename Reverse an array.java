// Solution1
class Solution {
    public int[] reverseArray(int arr[]) {
        int n = arr.length;
        int[] ans = new int[n];
        
        int i = 0;
        while (i < n) {
            ans[i] = arr[n - i - 1];  // Reverse index copy
            i++;
        }
        return ans;
    }
}


// Solution 2
f(l, r){
    if(l >= r) return;
    swap(arr[l], arr[r]);
    f(l + 1, r- 1);
}
