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
